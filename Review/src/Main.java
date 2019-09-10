public class Main {
    public static void main(String[] args) {
        //Trial for linear equation
        Problems a  = new Problems();
        a.linearEquation(2,4,6);

        //Trial for quadratic equation
        Problems b = new Problems();
        b.quadraticEquation(1,4,5,1);

        //Trial for cube root
        System.out.println();
        Problems c = new Problems();
        System.out.println(c.cubeRoot(-3));


    }
}
