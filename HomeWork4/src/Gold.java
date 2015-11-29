/**
 * Created by NathanStone on 11/14/15.
 */
public class Gold extends Loot {
    @Override
    public void start(Player player) {
        System.out.println("Your find GOLD!!!");
        //System.out.println("You find " + amount + " gold!");
        // LootSack in my Player method is increasing my GP. the Gold
        // in my gold class is doing nothing.
        // How can i send my lootSack to my Gold class

        player.onLoot(this.amount + 20);
    }



    public Gold(){
      super();
        int amount = (int) (Math.random() * 20 + 2);
    }
}
