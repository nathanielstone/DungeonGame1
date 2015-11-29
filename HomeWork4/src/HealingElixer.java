

public class HealingElixer extends Loot {

    public HealingElixer(){
        super();
       int amount = (int) (Math.random() * 15);
    }



    public void start(Player player) {
        System.out.println("You find a Healing Elixer!");
        player.onHeal(this.amount);

    }

}
