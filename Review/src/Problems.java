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
        //Return absolute value of n - mid x mid x mid for the precision
        public double diff(double n, double mid){
            if(n>(mid*mid*mid)){
                return (n-(mid*mid*mid));
            }
            else{
                return ((mid*mid*mid)-n);
            }

        }

        //Using binary search to find the cube root(mid)
        public double cubeRoot(double n){
            //Set start and end to the binary search
           double start = 0;
           double end = n;

           //Set precision (error accepted)
            double e = 0.0000001;


            //find the cube root (mid) of n
            while(true){
                //Calculate mid
                double mid = (start+end)/2;

                //Identify error
                double error = diff(n,mid);

                //if error is less than or equal to e, then mid is our solution
                if(error<=e){
                    return Math.round(mid*100.0)/100.0;
                }

                //if mid x mid x mid is greater than n, then end = mid;
                if ((mid*mid*mid)>n){
                    end = mid;
                }
                //if mid x mid x mid is less than n, then start = mid;
                if ((mid*mid*mid)<n){
                    start = mid;
                }


            }


        }
}
