public abstract class Card {
    private int numberCard;
    private String faceCard;

    Card(int numberCard, String faceCard){
        this.faceCard = faceCard;
        this.numberCard = numberCard;
    }

    public String getFaceCard() {
        return faceCard;
    }

    public int getNumberCard() {
        return numberCard;
    }
}
