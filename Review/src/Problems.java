public class Problems {
    double x;
    double root;

    //Methods

    //LINEAR EQUATION
    public void linearEquation(double a, double b, double c){
        //if a = b = 0; x can be any real value

        if(a == 0 && b==0 && c==0) {
            System.out.println("Infinite solution");
            x = Double.NEGATIVE_INFINITY;
            x = Double.POSITIVE_INFINITY;
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

    //QUADRATIC EQUATION
    public void quadraticEquation(double a, double b, double c, double constant){
        double root1 = 0;
        double root2 = 0;

        //if a = 0; x is undefined
        if(a == 0){
            System.out.println("No solution");
        }
        //find discriminant
        double d = Math.pow(b,2) - 4*a*(c - constant);

        //if discriminant less than 0, no solution
        if(d<0){
            System.out.println("No real root");
        }

        //if discriminant greater than 0, there will be two different real roots
       else if(d>0){
           root1 = -b + Math.sqrt(d);
           root2 = -b - Math.sqrt(d);
            System.out.format("Root 1 = %.2f, r and Root 2 = %.2f", root1, root2);
        }

        //if discriminant equals 0, there will be one or two same real roots.
       else if(d == 0){
           root1 = root2 = -b/(2*a);
           System.out.format("Root 1 = Root 2 = %.2f",root1);
        }
    }

        //CUBE ROOT
        //Return absolute value of n - root*root*root for the precision
        public double diff(double n, double root){
            if(n>(root*root*root)){
                return (n-(root*root*root));
            }
            else{
                return ((root*root*root)-n);
            }

        }

        //Using binary search to find the cube root
        public double cubeRoot(double n){
            //Create a variable "n1" which takes all value of n in the positive form
            double n1;
            if(n<0){
                n1 = n*-1;
            }
            else{
                n1 = n;
            }

            //Set start and end to the binary search
           double start = 0;
           double end = n1;

           //Set precision (error accepted)
            double e = 0.0000001;

            //find the cube root of n
            while(true){
                //Calculate root
                 root = (start+end)/2;

                //Identify error
                double error = diff(n1,root);

                //if error is less than or equal to e, then root is our solution
                if(error<=e){
                    //if n is negative then return neg mid
                   if(n<0){
                       return (Math.round(root*100.0)/100.0)*-1;
                   }

                   else{
                       return (Math.round(root*100.0)/100.0);
                   }

                }


               //if root*root*root is greater than n, then end = root, end the loop
                if ((root*root*root)>n1){
                    end = root;
                }
                //if root*root*root is less than n, then start = root; keep searching from root to n
                if ((root*root*root)<n1){
                    start = root;
                }
            }



        }
}
