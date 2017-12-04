public class Probability implements ProbabilityCalc{
    private double chance;
    public Probability(double amount,double sample){
        chance = amount/sample;
    }
    public double getChance(){
        return chance;
    }
    public double probabilityAND(Probability p2){
        return this.getChance()*(p2.getChance());
    }
    public double probabilityOR(Probability p2, double overlap){
        return this.getChance()+p2.getChance()-overlap;
    }
}
