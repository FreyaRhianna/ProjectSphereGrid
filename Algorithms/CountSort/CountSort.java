class CountSort{
  public static void main(String[] args){
    int[] arrayToSort = {12,15,10,10,3,4,5,6};
    arrayToSort = sort(arrayToSort, 20);
    for(int i =0 ; i < arrayToSort.length; i++){
      System.out.println(arrayToSort[i]);
    }
  };

  public static int[] sort(int[] arrayToSort, int k){
    int[] toEdit = new int[arrayToSort.length];
    int[] workingArray = new int[k];
    for(int i = 0; i < k; i++){
      workingArray[i] = 0;
    }
    for(int i=0; i < toEdit.length; i++){
      workingArray[arrayToSort[i]] = workingArray[arrayToSort[i]] + 1;
    }

    for(int i = 1; i < k; i++){
      workingArray[i] = workingArray[i - 1] + workingArray[i];
    }

    for(int i = toEdit.length - 1; i >= 0; i--){
      //System.out.println(workingArray[arrayToSort[i]]);
      toEdit[workingArray[arrayToSort[i]] - 1] = arrayToSort[i];
      workingArray[arrayToSort[i]] =  workingArray[arrayToSort[i]]  - 1; //so multiple copies get different array positions
    }

    return toEdit;
  };


}

/*
Can only sort numbers between [0,20)


*/
