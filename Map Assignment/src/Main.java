public class Main {
    public static void main(String[] args) {
        CaesarCipher message = new CaesarCipher("Hello");
        System.out.println(message.getShiftNumber());
        String cypherText = message.encrypt();
        System.out.println(cypherText);
        /*String decryptedText = message.decrypt(cypherText);
        System.out.println(decryptedText);*/
    }
}
