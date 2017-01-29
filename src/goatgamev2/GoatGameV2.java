package goatgamev2;

/**
 * Created by ilana on 1/27/2017.
 */
public class GoatGameV2 {
    public static void main(String[] args) {

        System.out.println("Game 1: Switch");
        Player sam = new SwitchPlayer("Sam");
        GameShowHost montyHall = new GameShowHost(sam);
        montyHall.play();

        System.out.println("\nGame 2: Keep");
        Player sarah = new KeepPlayer("Sarah");
        montyHall = new GameShowHost(sarah);
        montyHall.play();

        /*Door a = new Door();
        System.out.println("" + a.getPrize());

        Door b = new Door();
        System.out.println("" + b.getPrize());

        Door c = new Door();
        System.out.println("" + c.getPrize());

        Door d = new Door();
        System.out.println("" + d.isValidDoor());

        System.out.println("" + c.getDoorNum());

        System.out.println("" + Door.totalNumDoors);
        */
    }
}
