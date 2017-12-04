
import java.util.Random;
public class RPSPlayer implements Player
{
    private String name;
    private String choice;
    private boolean cpu;
    private int score;
    /**
     * Constructor for objects of class RPSPlayer
     */
    public RPSPlayer(boolean computer)
    {
        // initialise instance variables
        this.cpu = computer;
        this.name = setName(cpu);
    }

    /**
     * Returns String of "Rock", "Paper" or "Scissors"
     * Will be random if computer = true
     */
    public void setChoice(boolean computer) {
        if (computer == true){
            randomChoice();
        }
        else{
            System.out.println("enter your choice: \n rock \n paper \n scissors");
            name = scan.next();
        }
    }
    
    public boolean getCPU() {
        return cpu;
    }
    
    public int getScore() {
        return score;
    }
    
    public void updateScore(int value) {
        score+=value;
    }
    
    public String getName() {
        return name;
    }
    
    public String getChoice() {
        return choice;
    }
    
    public String toString() {
        return "The player " + name + " has choosen " + choice;
    }
    
    /**
     * Set's the player name.  If computer = true, returns "CPU"
     */
    public String setName(boolean computer) {
        if (computer == true){
            return "CPU";
        }
        else{
            System.out.println("please enter name");
            name = scan.next();
            return name;
        }
    }
    
     /**
     * If cpu then return a random choice
     */
    public String randomChoice() {
        Random gen = new Random();
        int value = gen.nextInt(3);
        if(value ==0){
            return "rock";
        }
        else if (value == 1){
            return "paper";
        }
        else{
            return "scissors";
        }
    }
}
