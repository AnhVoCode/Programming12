public class FaceCard extends Card{
    private String[] face = {"Jack","Queen","King","Ace"};
    private int[] value = {11,12,13,14};

    FaceCard(int numberCard, String faceCard) {
        super(numberCard, faceCard);
    }

    @Override
    public String getFaceCard() {
        String cardFace = null;
        for(int i=0;i<face.length;i++){
            cardFace = face[i];
        }
        return cardFace ;
    }
}
