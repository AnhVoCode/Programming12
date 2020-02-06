import java.util.Random;

public class SortArrays {
    static int[] merge(int[] L, int[]R){
        int[] num = new int[L.length+R.length];
       int i=0,j=0,k=0;
       while (i<L.length && j<R.length){
           if(R[j]>L[i]){
                 num[k++]=R[j++];
           }
           else{
               num[k++]=L[i++];
           }
       }
       while (i<L.length){
           num[k++]=L[i++];
       }
       while (j<R.length){
           num[k++]=R[j++];
       }
       return num;
    }

    static void mergeSort(int[] num){
        if(num.length<2) {
          return;
        }
        else {
            int mid = num.length/2;
            int[] left = new int[mid];
            int[] right = new int[num.length-mid];
            for(int i=0;i<left.length;i++){
                left[i]=num[i];
            }
            for(int i=0;i<right.length;i++){
                right[i]=num[i];
            }
            mergeSort(left);
            mergeSort(right);
            merge(left,right);
        }
    }
    public static void main(String[] args) {
        Random randint = new Random();
        int[]num = new int[10];
        for(int i=0;i<num.length;i++){
            num[i]= randint.nextInt(11);
        }
        mergeSort(num);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
