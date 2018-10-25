class HeapSort{
  public static void main(String[] args){
    int[] arrayToSort = {2,34,15,34,1,122};
    Heap heap = new Heap(arrayToSort);
    arrayToSort = heap.heapSort();
    System.out.println("sort");
    for(int i = 0; i < arrayToSort.length; i++){
      System.out.println(arrayToSort[i]);
    }
  }

}
