import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciSequence(3));
    }

    /**
     * Return the number at the position n in the fibonacci sequence
     * @param n - integer, position of the number in the sequence
     * @return - integer, the number at n position
     */
    public static int fibonacciSequence(int n) {
        if (n <=1) {
            return n;
        }
        else {
            return fibonacciSequence(n - 2) - fibonacciSequence(n - 1);
        }
    }
}
