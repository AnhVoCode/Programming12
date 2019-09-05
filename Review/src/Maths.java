import java.util.Scanner;

public class Maths {
    //Fields
    double a = 0;
    double b =0;
    double y = 0;
    double x = 0;
    
    Scanner in = new Scanner(System.in);

    public void linearSolved(double a, double b){
        a = in.nextDouble();
        b = in.nextDouble();

        if(a==0 && b ==0){
            y =0;
            System.out.println("x ");

        }
        else if(a == 0){
            y = this.b;

        }
    }

}
