#include <stdio.h>
#include <stdlib.h>

void merge(int *arrayToSort, int start, int end){
  int middle = (end + start)/2;
  int k = start;
  int i = 0;
  int j = 0;
  size_t lengthOfTemp1 = middle - start + 1;
  size_t lengthOfTemp2 = end - middle;
  int *temp1 = (int *)malloc(lengthOfTemp1 * sizeof(int));
  int *temp2 = (int *)malloc(lengthOfTemp2 * sizeof(int));
  for(int d = 0; d <lengthOfTemp1;d++ ){
    temp1[d] = arrayToSort[start + d];
  }
  for(int d =0; d<lengthOfTemp2; d++){
    temp2[d] = arrayToSort[middle+1+d];
  }
  while((i<lengthOfTemp1) && (j <lengthOfTemp2)){
    if(temp1[i] < temp2[j]){
      arrayToSort[k] = temp1[i];
      i++;
      k++;
    }else{
      arrayToSort[k] = temp2[j];
      j++;
      k++;
    }
  }

  while(i < lengthOfTemp1){
    arrayToSort[k] = temp1[i];
    i++;
    k++;
  }
  while(j < lengthOfTemp2){
    arrayToSort[k] = temp2[j];
    j++;
    k++;
  }
  free(temp1);
  free(temp2);
}

void sort(int *arrayToSort, int start, int end){
  if(start < end){
    int middle = (end + start)/2;
    sort(arrayToSort, start, middle);
    sort(arrayToSort,middle + 1, end);
    merge(arrayToSort, start, end);
  }
}

int main(){
  int arrayToSort[] = {100,2,3,8,6};
  size_t length = 5;
  sort(arrayToSort, 0, length-1);
  for(int i=0; i < length; i++){
    printf("%d\n", arrayToSort[i]);
  }
}
