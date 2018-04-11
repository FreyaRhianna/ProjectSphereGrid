class RunQuickSort{
    public static void main(String[] args){
        int length = 10;
        int[] arrayToDivide = {4,2,5,3,6,88,1};
        QuickSort sorter = new QuickSort();
        sorter.Quicksort(arrayToDivide,0, arrayToDivide.length-1);
        System.out.println("Final");
        for(int i = 0; i < arrayToDivide.length; i++){
            System.out.println(arrayToDivide[i]);
        }

    }

}