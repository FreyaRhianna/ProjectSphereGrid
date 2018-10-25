class Heap{
  private int[] arr;
  private int heapSize;

  public Heap(int[] arr){
    this.heapSize = arr.length;
    for(int i = (this.heapSize / 2)-1; i >=0; i--){
      this.maxHeapify(arr, i);
    }
    this.arr = arr;
    System.out.println("The heap");
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);

    }
  }


  public void maxHeapify(int[] arr, int i){
    int left = left(i);
    int right = right(i);
    int largest = i;
    if(left<heapSize && arr[left] > arr[i]){
      largest = left;
    }
    if(right < heapSize && arr[right] > arr[largest]){
      largest = right;
    }
    if(largest != i){
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;
      maxHeapify(arr, largest);
    }
  }


  public int left(int i){
    return(2*i + 1);
  }

  public int right(int i){
    return(2*i + 2);
  }

  public int[] heapSort(){
    int restoreSize = this.heapSize;
    int[] modArray = this.arr;
    for(int i = restoreSize  - 1; i >= 1; i--){
      int temp = modArray[i];
      modArray[i] = modArray[0];
      modArray[0] = temp;
      heapSize -= 1;
      maxHeapify(modArray, 0);
    }
    this.heapSize = restoreSize;
    return modArray;
  }
}
