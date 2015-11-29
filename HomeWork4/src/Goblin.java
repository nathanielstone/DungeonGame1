/**
 * Created by NathanStone on 11/14/15.
 */
public class Goblin extends Monster {


    public static final int GOBLIN_DAMAGE = (int)(Math.random() * 15);
    public static final int GOBLIN_HEALTH = 5;
    public static final String GOBLIN_NAME = "ANGRY-BEAVER";

    public Goblin() {
        super(GOBLIN_NAME, GOBLIN_HEALTH, GOBLIN_DAMAGE);

    }
}
