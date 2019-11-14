public class Main {
    public static void main(String[] args) {
        RockPaperScissors game1 = new RockPaperScissors();
        String computer = game1.getComputerChoice();
        String user = game1.getUserChoice();
        System.out.println(game1.gameScore(computer,user));

    }
}
