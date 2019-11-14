
import org.junit.Test;

import static org.junit.Assert.*;

public class RockPaperScissorsTest {
    /**
     * Test strategy:
     * Partition the input as follow:
     * Uncapitalized fist letter of the string.
     * Not in the choice (Rock, Paper, Scissors).
     */
    @Test
    public void testValidChoice(){
        RockPaperScissors game = new RockPaperScissors();
       String user = "Scissors";
       String user2 = "paper";
       String user3 = "Nail";
       assertTrue(game.isValidChoice(user));
       assertFalse(game.isValidChoice(user2));
       assertFalse(game.isValidChoice(user3));


    }

    /**
     * Test Strategy:
     * Partitioning the input as follows:
     * The userChoice input is invalid.
     * The user loses.
     * The user wins.
     * The useChoice is the same as the computerChoice.
     */
    @Test
    public void testGameScore(){
        RockPaperScissors game = new RockPaperScissors();
        String computer = "Rock";
        String user = "rock";
        assertTrue(game.isValidChoice(user)==false);
        assertEquals(-1,game.gameScore(computer,user));

        String user2 = "Rock";
        assertEquals(0, game.gameScore(computer,user2));

        String user3 = "Paper";
        assertEquals(1,game.gameScore(computer,user3));

        String user4 = "Scissors";
        assertEquals(-1,game.gameScore(computer,user4));
    }


}