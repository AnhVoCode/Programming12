public class TowerOfHanoi {
    public static int counter =0;
    public static void main(String[] args) {
        TowerOfHanoi towers = new TowerOfHanoi();
        towers.TowerOfHanoi(5,"A","C", "B");
        System.out.println(counter);
    }
    public void TowerOfHanoi(int n, String from, String to, String spare){
        if(n==1){
            System.out.println("Move disk from " + from + " to "+ to);
            counter++;
        }
        else{
            TowerOfHanoi(n-1,from,spare,to);
            TowerOfHanoi(1,from,to,spare);
            TowerOfHanoi(n-1,spare,to,from);
        }
    }

}
