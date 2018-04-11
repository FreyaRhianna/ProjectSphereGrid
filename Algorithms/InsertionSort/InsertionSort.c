#include <stdio.h>

void sort(int *toSort, size_t arrayLength){
  int pivot = 0;
  for(int i=0; i<arrayLength;i++){
    pivot = toSort[i];
    for(int j = i - 1; j >= 0; j--){
      if(toSort[j] > pivot){
        toSort[j+1] = toSort[j];
        if(j == 0 ){
          toSort[j] = pivot;
        }
      }else{
        toSort[j+1] = pivot;
        break;
      }
    }
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
