package goatgamev2;

/**
 * Created by ilana on 1/27/2017.
 */
public class KeepPlayer extends Player {

    public KeepPlayer(String nm) {
        name = nm;
        System.out.println("New KeepPlayer "+name+" created!");
    }

    public void selectNewDoor() {
        currentDoor = currentDoor;
    }
}
