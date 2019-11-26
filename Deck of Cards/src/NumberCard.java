public class NumberCard extends Card {
    private int numberCard;
    private int[] values = {2,4,5,6,7,8,9,10};


    NumberCard(int numberCard, String faceCard) {
        super(numberCard, faceCard);
        this.numberCard = numberCard;
    }

    @Override
    public int getNumberCard() {
        for(int i=0;i<values.length;i++){
            numberCard = values[i];
        }
        return numberCard;
    }
}