public class Rank implements Comparable<Card>{
    String faceCard;
    int value;

    Rank(String faceCard){
        this.faceCard = faceCard;
    }
    @Override
    public int compareTo(Card o) {
        if(this.value > o.getValue(o.getFaceCard())){
            return 1;
        }
        else if(this.value < o.getValue(o.getFaceCard())){
            return -1;
        }
        return 0;
    }
}


