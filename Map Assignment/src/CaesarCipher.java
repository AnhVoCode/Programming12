public class CaesarCipher {
    String plainText;
    int shiftNumber = 0;

    CaesarCipher(String plainText){
        this.plainText = plainText;
        for(int i=0;i<5;i++){
            shiftNumber = (int)Math.random()*plainText.length();
        }
    }


}
