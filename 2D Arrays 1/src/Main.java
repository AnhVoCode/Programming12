import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner in = new Scanner(System.in);
        int col = Integer.parseInt(in.nextLine());
        int row = Integer.parseInt(in.nextLine());
        int[][] num = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[j][i]= (int) (Math.random()*90)+10;
            }
        }

        //Print Arrays
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(num[j][i]+"\t");
            }
            System.out.println();
        }

        //Sum
        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum+=num[j][i];
            }
        }
        System.out.println(sum);

    }
}
