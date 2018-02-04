
import java.util.Arrays;

class MergeSort {
    public void sort(int[] arrayToDivide, int start, int end){
        if(start < end){
            int middle = (end + start) /2;
            sort(arrayToDivide,start, middle);
            sort(arrayToDivide,middle + 1, end);
            merge(arrayToDivide, start, end);
        }
    }
    public void merge(int[] arrayToMerge,int start, int end){
        int middle = (end+start)/2;
        int k = start;
        int i = 0;
        int j = 0;
        int[] temp1 = new int[middle - start + 1];
        int[] temp2 = new int[end - middle];
        for(int d = 0 ; d <temp1.length; d++){
            temp1[d] = arrayToMerge[start + d];
        }
        for(int d = 0; d<temp2.length; d++){
            temp2[d] = arrayToMerge[middle + 1 + d];
        }

        while( i < temp1.length && j < temp2.length){
            if(temp1[i] < temp2[j]){
                arrayToMerge[k] = temp1[i];
                i++;
                k++;
            }else{
                arrayToMerge[k] = temp2[j];
                j++;
                k++;
            }
        }

        while(i < temp1.length){
            arrayToMerge[k] = temp1[i];
            i++;
            k++;
        }
        while(j < temp2.length){
            arrayToMerge[k] = temp2[j];
            j++;
            k++;
        }

    }

}