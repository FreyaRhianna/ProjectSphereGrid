#include <stdio.h>

void sort(int *toSort, size_t arrayLength){
  int pivot = 0;
  for(int i=0; i<arrayLength;i++){
    pivot = toSort[i];
    int j = i -1;

    while(j >=0  && toSort[j] > pivot){
      toSort[j+1] = toSort[j];
      j--;
    }
    toSort[j+1] = pivot;


  }
}

int main(){
  int toSort[] = {4,3,4,56,6,8,7};
  size_t length = 7;
  sort(toSort, length);
  for(int i = 0; i < length; i++ ){
    printf("%d\n", toSort[i]);
  }
}
