class InsertionSort{

    public static void main(String[] args){
        int[] arrayToSort = {4,3,4,56,6,8,7,100};
        sort(arrayToSort);
        for(int i =0; i< arrayToSort.length;i++){
            System.out.println(arrayToSort[i]);
        }

    }

    public static void sort(int[] arrayToSort){
        int pivot;
        for(int i =0; i< arrayToSort.length;i++){
            pivot = arrayToSort[i];
            int j = i - 1;
            while(j >=0 && arrayToSort[j] > pivot){
              arrayToSort[j+1] = arrayToSort[j];
              j--;
            }
            arrayToSort[j+1] = pivot;
        }
    }
}
