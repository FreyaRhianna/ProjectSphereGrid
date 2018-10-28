class RunInversionCounter{
    public static void main(String[] args){
        int[] arrayToDivide = {4,2,5,3,6,1,7,0};
        InversionCounter merger = new InversionCounter();
        merger.sort(arrayToDivide,0, arrayToDivide.length - 1);
        System.out.println(merger.count);
    }
}
