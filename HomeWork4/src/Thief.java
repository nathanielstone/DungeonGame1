/**
 * Created by NathanStone on 11/14/15.
 */
public class Thief extends Player {
    private static final int THIEF_DAMAGE = 20;
    private final double LOOT_MODIFIER = 1.2;
    public static final int THIEF_HEALTH = 100;
    public static final String THIEF_NAME = "The Thief.";

    public Thief() {
        super(THIEF_NAME, THIEF_HEALTH, THIEF_DAMAGE);
    }

    @Override
    protected void attack(Character Monster) {
        super.attack(Monster);
    }


    public void onLoot(int gold){
        int modifiedGold = (int)(gold * LOOT_MODIFIER);
        super.onLoot(modifiedGold);
    }

}
