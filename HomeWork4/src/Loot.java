import java.util.Random;

/**
 * Created by NathanStone on 11/14/15.
 */
public abstract class Loot implements Encounter {

    protected int amount;


    public int randomAmountGenerator(){

        Random rand = new Random();

        amount = rand.nextInt(20) + 1;

        return randomAmountGenerator();
    }
}
