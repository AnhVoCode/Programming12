import java.util.HashMap;

public class CaesarCipher {
    String plainText;
    private int shiftNumber = 0;

    CaesarCipher(String plainText){
        this.plainText = plainText;
        for(int i=0;i<5;i++){
            shiftNumber = (int)(Math.random()*25)+1;
        }
    }

    public int getShiftNumber() {
        return shiftNumber;
    }

    public String encrypt(){
        String cypherText = "";
        int num = 0;
        for(int i=0;i<plainText.length();i++){
            num = (i+shiftNumber)%26;

        }
        return cypherText;
    }

    public String decrypt(String cypherText){
        String decryptText="";
        for(int i=0;i<cypherText.length();i++){
            char decryptChar = cypherText.charAt((i-shiftNumber)%26);
            decryptText += decryptChar;
        }
        return decryptText;
    }




}
