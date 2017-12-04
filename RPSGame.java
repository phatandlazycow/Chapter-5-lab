
public class RPSGame implements Game
{
    // instance variables - replace the example below with your own
    Player pOne;
    Player pTwo;
    int numPlayers;
   

    /**
     * Constructor for objects of class RPS
     */
    public RPSGame()
    {
        // initialise instance variables
        numPlayers = determineNumberPlayers();
        
        playGame();
    }
    
    
    public void playGame() {
        setPlayers();
        while(continueGame()) {
            pOne.setChoice(pOne.getCPU());
            pTwo.setChoice(pTwo.getCPU());
            int win  = comparePlayers(pOne, pTwo);
            //Print results
            System.out.println(pOne+ "\n" + pTwo); //toString in RPSPlayer
            
            updateScore(win);
            System.out.println("The score for " + pOne.getName() + " is: " + pOne.getScore());
            System.out.println("The score for " + pTwo.getName() + " is: " + pTwo.getScore());
            System.out.println();
        }
        System.out.println();
        System.out.println("Thank you for playing.  The final score is: \n" + pOne.getName() + ":\t" + pOne.getScore());
        System.out.println(pTwo.getName()+ ": \t" + pTwo.getScore());
        
    }
    
    public void setPlayers() {
        
         if (numPlayers == 1) {
            pOne = new RPSPlayer(false); //human player
            pTwo = new RPSPlayer(true); //cpu
        }
        else {
            pOne = new RPSPlayer(false); //human player 1
            pTwo = new RPSPlayer(false); //human player 2
        }
    }
    
     /**
     * Returns 1 or 2 based on how many players are playing RPS
     */
    public int determineNumberPlayers() {
        System.out.println("how many players are there? \n 1 or 2?");
        return  scan.nextInt();
    }
    
    /**
     * Compare player values and return 1 for p1 win, 0 for tie & -1 for loss
     */
    public int comparePlayers(Player p1, Player p2) {
        if(p1.equals (p2)){
            return 0;
        }
        else if (p1.getChoice()== "rock"&& (p2.getChoice()== "paper")||p1.getChoice()=="scissors"&&(p2.getChoice()== "rock")||p1.getChoice()=="paper"&&(p2.getChoice()== "rock")){
            return -1;
        }
        else{
            return 1;
        }
    }
    
    /**
     * Update score based on who wins. Winner will be 1 for player 1 win, 0 for tie and -1 for player 2 win
     */
    public void updateScore(int winner) {
        if (winner ==0){
            
        }
       
    }
    
    /**
     * Ask to continue and return true for yes
     */
    public boolean continueGame() {
        System.out.println("Would you like to play again, y/n");
        String answer = scan.next();
        if(answer.equals("n")){
            return false;
        }
        else{
            return true;
        }
    }

}
