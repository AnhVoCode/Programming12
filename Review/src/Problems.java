public class Problems {


    //Methods

    //Solve linear equation in the form ax + b = c
    public void linearEquation(double a, double b, double c){
        double ans;
        //if a = b = 0; x can be any real value
        if(a == 0 && b==0 && c==0) {
            System.out.println("Infinite solution");
        }

        else {
            ans = (c-b)/a;

            //if a = 0, x is undefined
            System.out.println(ans);
            if(a==0){
                System.out.println("No solution");
            }


        }
    }

    //Solve quadratic equation in the form ax^2 + bx + c = constant
    public void quadraticEquation(double a, double b, double c){
        double root1 = 0;
        double root2 = 0;
        //if a = 0; x is undefined
        if(a == 0){
            System.out.println("No solution");
        }
        //find discriminant
        double d = Math.pow(b,2) - 4*a*c;

        //if discriminant < 0, no solution
        if(d<0){
            System.out.println("No real root");
        }

        //if discriminant > 0, there will be two different real roots
       else if(d>0){
           root1 = -b + Math.sqrt(d);
           root2 = -b - Math.sqrt(d);
            System.out.format("Root 1 = %.2f, r and Root 2 = %.2f", root1, root2);
        }

        //if discriminant = 0, there will be one or two same real roots.
       else if(d == 0){
           root1 = root2 = -b/(2*a);
           System.out.format("Root 1 = Root 2 = %.2f",root1);
        }
    }

    
}
