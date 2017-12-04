import java.util.Scanner;

public interface Player
{
    Scanner scan = new Scanner(System.in);
    /**
     * Gets a String of "rock", "raper" or "scissors"
     * Will be random if computer = true
     */
    void setChoice(boolean computer);
    
    /**
     * Set's the player name.  If computer = true, returns "CPU"
     */
    String setName(boolean computer);
    
    /**
     * Returns the name of the player, CPU if a computer
     */
    String getName();
    
    /**
     * If cpu then return a random choice
     */
    String randomChoice();
    
    /**
     * Returns the choice of the player
     */
    String getChoice();
    
    /**
     * Returns the current player score
     */
    int getScore();
    
    /**
     * Updates the score based on win
     */
    void updateScore(int value);
    
    /**
     * Returns true if the player is played by the computer
     */
    boolean getCPU();
}
