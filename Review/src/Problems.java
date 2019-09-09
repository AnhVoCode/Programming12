public class Problems {
    //Fields
    double x = 0;


    //Methods

    //Solve linear equation in the form ax + b = c
    public void linearEquation(double a, double b, double c){

        //if a = b = 0; x can be any real value
        if(a == 0 && b==0 && c==0) {
            System.out.println("Infinite solution");
        }

        else {
            x = (c-b)/a;

            //if a = 0, x is undefined
            System.out.println(x);
            if(a==0){
                System.out.println("No solution");
            }


        }
    }

    //Solve quadratic equation in the form ax^2 + bx + c = constant
    public void quadraticEquation(double a, double b, double c){
        
    }
}
