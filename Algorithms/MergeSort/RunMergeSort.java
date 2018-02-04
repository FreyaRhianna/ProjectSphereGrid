class RunMergeSort{
    public static void main(String[] args){
        int length = 10;
        int[] arrayToDivide = {4,2,5,3,6};
        MergeSort merger = new MergeSort();
        merger.sort(arrayToDivide,0, arrayToDivide.length - 1);
        System.out.println("Final");
        for(int i = 0; i < arrayToDivide.length; i++){
            System.out.println(arrayToDivide[i]);
        }
    }
}