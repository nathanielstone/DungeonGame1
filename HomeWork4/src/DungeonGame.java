
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class DungeonGame implements Game {


    private Collection<Room> rooms;

    public static void main(String[] args) {
        Game game = new DungeonGame(26);
        game.play();

    }


    public void play() {


        Scanner in = new Scanner(System.in);
        boolean inPlay = true;
        int role = 0;
        int door = 0;
        Player player = null;

        System.out.println();
        System.out.println("         Welcome to the Dungeon Game");
        System.out.println("         ---------------------------");
        System.out.println("YOU'RE IN THE DUNGEONS OF A CASTLE. YOU MUST ESCAPE!");
        System.out.println("Explore the maze, find 100GP and pay Dr.Deneke and he will let you go!");
        System.out.println("Which role would you like to play?");
        System.out.println("[1] Warrior");
        System.out.println("[2] Thief");

        try {
            role = in.nextInt();
            if (role == 1) {
                player = new Warrior();
            } else if (role == 2) {
                player = new Thief();
            } else {
                System.out.println("Not a valid player choice GOODBYE!");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid player!");
        }

        System.out.println("You've selected: " + player.getName());


        while (inPlay) {
            System.out.println("================================");
            System.out.println();
            System.out.println("          YOUR NEW STATS:");
            System.out.println("         [---------------]");
            System.out.println("         [    HP--: " + player.health + "  ] ");

            System.out.println("         [    GP--: " + player.lootSack + "    ]");
            System.out.println("         [    Turn: " + role + "    ]");
            role++;
            System.out.println("         [    DOOR: " + door + "    ]");
            System.out.println("         [---------------]");
            System.out.println();
            System.out.println("================================");
            System.out.println();
            if (player.lootSack >= 100 || player.health < 0) {
                System.out.println(" ! Game Over !");
                System.out.println(" Play again?");
                break;
            }else{
                System.out.println("You're in a Dungeon. Select which door to enter to [1-25]");
                door = in.nextInt();

          /*  I need to loop through my Array and give each index a Random number Between 1 and 4.
                (using the "enter();" method)
            In the array once the position has been used set the value == null.
                (use the hasVisited(); in the Room class).

             */

                if (door > rooms.size()) {
                    System.out.println("Please enter a valid room number");
                } else {
                    int roomCount = 0;
                    Room selectedRoom = null;


                    for (Room r : rooms) {
                        if (roomCount++ == door) {
                            selectedRoom = r;
                            break;
                        }
                    }

                    System.out.println("You are entering room....");
                    System.out.println();
                    System.out.println(" - " + door + " - ");
                    System.out.println();
                    if (selectedRoom.hasVisited()) {
                        System.out.println("You're already been there!");
                        continue;
                    } else {
                        selectedRoom.enter(player);
                        System.out.println();
                        //System.out.println("Turn: " + role);
                        //System.out.println("DOOR: " + door);
                        continue;

                    }


                }

            }
        }

    }

    public DungeonGame(int dungeonSize) {
        rooms = new ArrayList<>();

        for (int i = 0; i < dungeonSize; i++) {
            rooms.add(new Room());
        }
    }


}