package goatgamev2;

/**
 * Created by ilana on 1/27/2017.
 */
public class SwitchPlayer extends Player {

    public SwitchPlayer(String nm) {
        name = nm;
        System.out.println("New SwitchPlayer " + name + " created!");
    }

    public void selectNewDoor() {
        int sumDoors = 6; //Door 1 + Door 2 + Door 3 = 6
        currentDoor = sumDoors - currentDoor - GameShowHost.goatDoor;
    }
}
