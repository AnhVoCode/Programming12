public class SortArrays {
    static int[] merge(int[] a, int[]b){
        int aLength = a.length;
        int bLength = b.length;
        int[] num = new int[aLength+bLength];
        System.arraycopy(a,0,num,0,aLength);
        System.arraycopy(b,0,num,aLength,bLength);
        return num;
    }

    static int[] mergeSort(int[] num){
        if(num.length==1) {
          return num;
        }
        else {
            int[] left = {};
            mergeSort()
        }
    }
    public static void main(String[] args) {

    }
}
