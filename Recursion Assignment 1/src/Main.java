import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> result = new ArrayList<>();
       result = fibonacciSequence(3);
       for(int i : result){
           System.out.println(i);
       }
    }

    public static ArrayList<Integer> fibonacciSequence(int n){
        ArrayList<Integer> result = new ArrayList<>();
        if(n==0){
            result.add(1);
            return result;
        }
        else {
            for(int i =1;i<=n;i++){
                int num = i+(i-1);
                result.add(num);
            }
            return result;
        }

    }
}
