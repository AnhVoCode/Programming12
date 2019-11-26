public class FaceCard extends Card{
    private String faceCard;
    private String[] face = {"Jack","Queen","King","Ace"};
    private int[] value = {11,12,13,14};

    FaceCard(int numberCard, String faceCard) {
        super(numberCard, faceCard);
        this.faceCard = faceCard;
    }

    @Override
    public String getFaceCard() {
        for(int i=0;i<face.length;i++){
           faceCard = face[i];
        }
        return faceCard ;
    }
}
