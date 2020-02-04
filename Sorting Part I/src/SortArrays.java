
public class SortArrays {
    static int[] sortArrays(int[]array1,int[] array2){
        int length1 = array1.length;
        int length2 = array2.length;
        int[]array3 = new int[length1+length2];
        System.arraycopy(array1,0,array3,0,length1);
        System.arraycopy(array2,0,array3,length1,length2);
        for(int i=0;i<array3.length;i++){
            for(int j=1;j<array3.length;i++){
                if(array3[j-1]<array3[j]){
                     int temp = array3[j-1];
                     array3[j-1] = array3[j];
                     array3[j] = temp;
                }
            }
        }
        return array3;
    }
    public static void main(String[] args) {
        int[] array1 = {27};
        int[] array2 = {84};
        int[] array3 = sortArrays(array1,array2);
        for(int i=0;i<array3.length;i++){
            System.out.println(array3[i]);
        }


    }
}
