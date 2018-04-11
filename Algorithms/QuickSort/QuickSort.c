#include <stdio.h>

int Partition(int *A, int start, int end){
  int temp = 0;
  int x = A[end];
  int i = start - 1;
  for (int j = start; j < end; j++){
    if(A[j] <= x){
      i = i + 1;
      temp = A[i];
      A[i] = A[j];
      A[j] = temp;
    }
  }
  temp = A[i + 1];
  A[i+1] = A[end];
  A[end] = temp;
  return (i+1);
}

void QuickSort(int *A, int start, int end){
  if(start < end){
    int q = Partition(A,start,end);
    QuickSort(A,start,q-1);
    QuickSort(A,q+1,end);
  }
}
int main(){
  int arrayToSort[] = {4,2,5,3,6,88,1};
  size_t length = 7;
  QuickSort(arrayToSort, 0, length-1);
  for(int i = 0; i < length; i++ ){
    printf("%d\n", arrayToSort[i]);
  }
}
