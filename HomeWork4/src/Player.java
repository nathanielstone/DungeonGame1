/**
 * Created by NathanStone on 11/14/15.
 */
public class Player extends Character {


    public int gold;
    public int lootSack;

    public Player(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attack(Monster target){
        super.attack(target);
    }


    public void onHeal(int amount){
         health += (int)(Math.random() * 10);
        System.out.println("Your new HP = " + health);
    }

    public void onLoot(int amount){
        lootSack += (int)(Math.random() * 20 + 20);
        System.out.println("Your new GP = " + lootSack);



    }


}
