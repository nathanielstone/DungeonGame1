/**
 * Created by NathanStone on 11/15/15.
 */
import java.util.*;


public class Room {


    boolean visited = false;
    Encounter encounter;


          /* a random number between 1 and 4. int r = (int) (Math.Random() *( upper - lower) + lower.
            !!!I need to loop through my Array and give each index a Random number Between 1 and 4.
            In the array once the position has been used set the value == null!!!.

             */

    public Room(){
        Random rand = new Random();
        int e = rand.nextInt(4) + 1;

        switch (e) {
            case 1:
                encounter = new Zombie();
                break;
            case 2:
                encounter = new Goblin();
                break;
            case 3:
                encounter = new HealingElixer();
                break;
            case 4:
                encounter = new Gold();
                break;
            default:
                System.out.println("Random number out of range.");
                break;
        }
    }

        public void enter(Player player) {
            encounter.start(player);


            visited = true;
        }

        public boolean hasVisited() {

            //Use the hasVisted(); to check if the user has already visted the room
            // return value == null if true.
            return visited;
        }


    }




