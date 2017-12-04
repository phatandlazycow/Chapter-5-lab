public class ProbablilityTest
{
    public static void main(String[] args)
    {
        Probability cain = new Probability(2,10);
        Probability undertaker = new Probability(5,10);
        System.out.println(undertaker.probabilityAND(cain));
        System.out.println(cain.probabilityOR(undertaker,cain.probabilityAND(undertaker)));
    }
}
