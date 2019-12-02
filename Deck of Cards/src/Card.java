public abstract class Card {
    private int numberCard;
    private String faceCard;
    private int value;
    Suits suits;

    Card (int numberCard, String faceCard, Suits suits){
        this.numberCard = numberCard;
        this.faceCard = faceCard;
        this.suits = suits;
    }

    public String getFaceCard() {
        return faceCard;
    }

    public int getNumberCard() {
        return numberCard;
    }
    public int getValue(String faceCard){
        return value;
    }

}
