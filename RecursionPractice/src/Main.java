import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Node> nodes = new ArrayList<>();
    public static Node getNode(int id){
        Node getNode=new Node(0,0,0);
        for(Node n:nodes){
            if(n.id ==id){
                getNode = n;
            }
        }
        return getNode;
    }
    public static void leafNodes(Node node){
        if(node.left==0 && node.right==0){
            System.out.print(node.id+ " ");
        }
        else {
            leafNodes(getNode(node.left));
            leafNodes(getNode(node.right));
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
       leafNodes(nodes.get(0));
       
    }
}
