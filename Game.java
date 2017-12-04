import java.util.Scanner;

public interface Game
{
    Scanner scan = new Scanner(System.in); //used to set values
    
    /**
     * Contains game mechanics (how to play)
     */
    void playGame();
    
    /**
     * Returns 1 or 2 based on how many players are playing RPS
     */
    int determineNumberPlayers();
    
    /**
     * Compare player values and return 1 for p1 win, 0 for tie, -1 for loss
     */
    int comparePlayers(Player p1, Player p2);
    
    /**
     * Will set player data based on how many players present
     */
    public void setPlayers();
    
    /**
     * Update score based on who win.  win = 1 is p1 win, win = 0 is tie, win = -1 p2 win
     */
    void updateScore(int win);
    
    /**
     * Ask to continue and return true for yes
     */
    boolean continueGame();
}
