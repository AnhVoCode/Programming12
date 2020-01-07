
import java.util.HashMap;

public class CaesarCipher {
    private int shiftNumber = (int)(Math.random()*25)+1;
    private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        String encrypt = cipher.encrypt("Love");
        System.out.println(cipher.getShiftNumber());
        System.out.println("Cipher Text: " + encrypt);
        String decrypt = cipher.decrypt(encrypt);
        System.out.println("Decipher Text: " + decrypt);
    }

    public int getShiftNumber() {
        return shiftNumber;
    }

    public String encrypt(String plainText) {
        String plain = plainText.toUpperCase();
        HashMap<Integer,Character> shiftedMap = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            shiftedMap.put(i+1,alphabet.charAt((i+shiftNumber)%26));
        }
        String cypherText = "";
        for(int i=0;i<plain.length();i++){
            cypherText+=shiftedMap.get(alphabet.indexOf(plain.charAt(i)+1));
        }
        return cypherText;
    }

    public String decrypt(String cypherText){
        String cypher = cypherText.toUpperCase();
        HashMap<Integer,Character> baseMap = new HashMap<>();
        for(int i=0;i<alphabet.length();i++){
            baseMap.put(i+1,alphabet.charAt(i));
        }

        String decypherText = "";
        for(int i=0;i<cypher.length();i++){
            int keyValue = (alphabet.indexOf(cypher.charAt(i)+1)-shiftNumber)%26;
            if(keyValue<0){
                keyValue+=26;
            }
            decypherText+=baseMap.get(keyValue);

        }
        return decypherText;
    }
}

