/**
 * Created by NathanStone on 11/14/15.
 */
public class Warrior extends Player {

    public static final int WARRIOR_DAMAGE = 50;
    public static final int WARRIOR_HEALTH = 100;
    public static final String WARRIOR_NAME = "FRODO THE WARRIOR";

    public Warrior() {
        super(WARRIOR_NAME, WARRIOR_HEALTH, WARRIOR_DAMAGE);
    }

    @Override
    public void attack(Monster target) {
        super.attack(target);
    }
}
