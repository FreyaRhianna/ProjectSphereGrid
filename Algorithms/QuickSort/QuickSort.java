class QuickSort{

    public void Quicksort(int[] A, int start, int end){
        if( start < end) {
            int q = Partition(A, start, end);
            Quicksort(A, start, q - 1);
            Quicksort(A, q + 1, end);
        }
    }

    public int Partition(int[] A, int start,int end){
        int temp;
        int x = A[end];
        int i = start - 1;
        for (int j = start; j < end; j++){
            if(A[j] <=x){
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
}