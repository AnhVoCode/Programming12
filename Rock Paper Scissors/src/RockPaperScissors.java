import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    /**
     * Generate Random Computer Choice using random integer between 1 and 3
     * 1 - Rock, 2 - Paper, 3 -Scissors
     * @return computer choice, string (Rock, Paper or Scissors)
     */
    private String computerChoice(){
        Random number = new Random();
        int computerChoice = number.nextInt(3)+1;
        String computer = "";
        if(computerChoice==1){
            computer = "Rock";
        }
        if (computerChoice==2){
            computer = "Paper";
        }
        if(computerChoice==3){
            computer = "Scissors";
        }
        return computer;
    }
    public String getComputerChoice(){
        return computerChoice();
    }

    /**
     * Input for user Choice: Rock, Paper, Scissors
     * Input required: a String, first letter must be capitalized
     * @return user choice, string (Rock, Paper, or Scissors
     */
    public String userChoice(){
        Scanner in = new Scanner(System.in);
        String user;
        System.out.println("Your choice: Rock, Paper, Scissors");
        user = in.nextLine();
        return user;
    }

    /**
     * Determine if the user input is valid or not
     * @param user - string, user choice (Rock, Paper, Scissors)
     * @return true if the user choice is valid, false if the user choice is  invalid
     */
    public boolean isValidChoice(String user){
        boolean valid;
       if(user.compareTo("Rock")==0){
           valid = true;
       }
       if(user.compareTo("Paper")==0){
           valid = true;
       }
       if(user.compareTo("Scissors")==0){
           valid = true;
       }
       else {
           valid = false;
       }
       return valid;
    }

    /**
     * Determine if the user win or lose or is there error in the user input.
     * @param computer string, computer choice
     * @param user     string, user choice
     * @return the game score, integer
     *         -1 : the user loses or there is error in the user input
     *         0  : there is a tie
     *         1  : the user wins
     */
   public int gameScore(String computer, String user){
       System.out.println("Your Choice: "+ user );
       System.out.println("Computer Choice: "+computer);
       int score =0;
       if(isValidChoice(user)==false){
           return -1;
       }
       else {
           if(computer.equals(user)){
               score= 0;
           }
           if(computer.equals("Rock")&& user.equals("Paper")){
               score = 1;
           }
           if(computer.equals("Rock")&& user.equals("Scissors")){
               score = -1;
           }
           if(computer.equals("Paper")&& user.equals("Rock")){
               score = -1;
           }
           if(computer.equals("Paper")&& user.equals("Scissors")){
               score=1;
           }
           if(computer.equals("Scissors") && user.equals("Paper")){
               score=1;
           }
           if(computer.equals("Scissors") && user.equals("Rock")){
               score = 1;
           }
       }
       return score;
   }

}
