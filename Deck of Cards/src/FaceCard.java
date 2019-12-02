public class FaceCard extends Card{
    private String faceCard;
    private int value;
    private String[] face = {"Jack","Queen","King","Ace"};
    private int[] values = {11,12,13,14};

    FaceCard(int numberCard, String faceCard, Suits suits) {
        super(numberCard, faceCard,suits);
        this.faceCard = faceCard;
    }

    @Override
    public int getValue(String faceCard) {
        for(int i=0;i<face.length;i++){
            if(faceCard.equals(face[i])){
                value = values[i];
            }
        }
        return value;
    }
    @Override
    public String getFaceCard() {
        for(int i=0;i<face.length;i++){
           faceCard = face[i];
        }
        return faceCard ;
    }
}
