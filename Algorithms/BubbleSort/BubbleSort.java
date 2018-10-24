class BubbleSort{

  public static void main(String[] args){
    int[] arrayToSort = {1,2,4,2,1,5,6,9};
    sort(arrayToSort);
    for(int i=0; i<arrayToSort.length; i++){
      System.out.println(arrayToSort[i]);
    }
  }

  public static void sort(int[] arrayToSort){
    for(int i = 0; i < arrayToSort.length; i++){
      for(int j = i; j < arrayToSort.length - 1; j++){
        if(arrayToSort[i] > arrayToSort[j]){
          int temp = arrayToSort[i];
          arrayToSort[i] = arrayToSort[j];
          arrayToSort[j] = temp;
        }
      }
    }
  }
}

/*ALT TOPDOWN
public static void sort(int[] arrayToSort){
  for(int i = 0; i < arrayToSort.length; i++){
    for(int j = arrayToSort.length - 1; j > i; j--){
      if(arrayToSort[i] > arrayToSort[j]){
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = temp;
      }
    }
  }
}



*/
