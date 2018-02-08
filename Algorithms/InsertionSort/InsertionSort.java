class InsertionSort{

    public static void main(String[] args){
        int[] arrayToSort = {4,3,4,56,6,8,7};
        sort(arrayToSort);
        for(int i =0; i< arrayToSort.length;i++){
            System.out.println(arrayToSort[i]);
        }

    }

    public static void sort(int[] arrayToSort){
        int pivot;
        for(int i =0; i< arrayToSort.length;i++){
            pivot = arrayToSort[i];
            for(int j=i-1 ; j >=0;j--){
                if(arrayToSort[j]  > pivot){
                    arrayToSort[j+1] = arrayToSort[j];
                    if(j == 0){
                        arrayToSort[j] = pivot;
                    }
                }else{
                    arrayToSort[j+1] = pivot;
                    break;
                }
            }
        }
    }
}