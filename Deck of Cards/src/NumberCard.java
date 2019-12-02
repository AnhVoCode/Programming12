public class NumberCard extends Card {
    private int value;
    private int numberCard;

    NumberCard(int numberCard, String faceCard, Suits suits) {
        super(numberCard, faceCard, suits);
        this.numberCard = numberCard;
    }

    public int getValue(int numberCard){
        return value = numberCard;
    }
    @Override
    public int getNumberCard() {
        return numberCard;
    }
}
