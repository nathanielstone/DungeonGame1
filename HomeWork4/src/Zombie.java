/**
 * Created by NathanStone on 11/14/15.
 */
public class Zombie extends Monster {


    private final static int ZOMBIE_DAMAGE = (int)(Math.random() * 10) + 2;
    public final static int ZOMBIE_HEALTH = 10;
    public final static String ZOMBIE_NAME = "EZIKIEL-THE-WALKER";



    public Zombie() {
        super(ZOMBIE_NAME, ZOMBIE_HEALTH, ZOMBIE_DAMAGE);

    }
}
