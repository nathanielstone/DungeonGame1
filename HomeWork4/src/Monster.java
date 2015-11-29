import java.util.Scanner;

/**
 * Created by NathanStone on 11/14/15.
 */
public class Monster extends Character implements Encounter {


    public Monster(String name, int health, int damage) {
        super(name, health, damage);
    }


    public void attack(Player target) {
        super.attack(target);

    }

    @Override
    public void start(Player player) {
        System.out.println("You encounter a MONSTER!!");
        attack(player);
        System.out.println();
        System.out.println("Your health is now : " + player.health);
        System.out.println();
        while(true){
            System.out.println("What shall you do?");
        System.out.println("[1] ATTACK!");
        System.out.println("[2] RUN!!!");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
            if (in == 1) {
                onHit(50);
                System.out.println();
                System.out.println("Its super effective!");
                System.out.println(getName() + " has Collapsed!");
                break;
            } else if (in == 2) {
                onRun(10);
                System.out.println("You are hit by " + this.getName());
                System.out.println();
                attack(player);
                break;
            } else if (in != 1 || in != 2) {
                System.out.println("Not a proper choice! Please choose 1 or 2.");
                System.out.println();


            }
        }
        }
    }


