/**
 * Created by NathanStone on 11/14/15.
 */
public abstract class Character {
    public int health;
    private String name;
    private int damage;
    private int onRun;



    protected Character(String name, int health, int damage){
        this.damage = damage;
        this.health = health;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    protected void attack(Character target){
        System.out.println(this.getName() + " attacked " + target.getName());
        System.out.println();
        target.onHit(damage);

    }



    public void onHit(int damage){
        System.out.println(this.getName() + " was hit for " + damage + " damage!!");
        this.health -= damage;
    }

    public void onRun(int damage){
        damage = 5;
        this.health -= damage;
        System.out.println("You try to run....");
        System.out.println("You were hit on your way out! ");

    }


}


