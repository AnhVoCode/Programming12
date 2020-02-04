import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Node> nodes = new ArrayList<>();
    public static void getNode()
    public static void leafNodes(Node node){
        if(node.left==0 && node.right==0){
            System.out.println(node.id);
        }
        else {
            leafNodes(nodes.get(1));
            System.out.println(nodes.get(15).id);
            leafNodes(nodes.get(2));
        }
    }
    public static void setup() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Tree.txt"));
        while(scan.hasNextLine()){
            String[] temp = scan.nextLine().split(" ");
            int id = Integer.parseInt(temp[0]);
            int left = Integer.parseInt(temp[1]);
            int right = Integer.parseInt(temp[2]);
            nodes.add(new Node(id,left,right));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
       setup();
       
    }
}
