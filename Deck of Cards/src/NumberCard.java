public class NumberCard extends Card {
    private int[] values = {2,4,5,6,7,8,9,10};


    NumberCard(int numberCard, String faceCard) {
        super(numberCard, faceCard);
    }

    @Override
    public int getNumberCard() {
        int cardNumber=0;
        for(int i=0;i<values.length;i++){
            cardNumber = values[i];
        }
        return cardNumber;
    }
}
