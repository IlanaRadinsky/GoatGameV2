package goatgamev2;

import java.util.Random;

/**
 * Created by ilana on 1/28/2017.
 */
public abstract class Player {
    int currentDoor;
    String name;

    public void selectInitialDoor() {
        Random rnd = new Random();
        int x = rnd.nextInt(3);
        currentDoor = x+1;
    }

    abstract public void selectNewDoor();

    public int getCurrentDoor() {
        return currentDoor;
    }

    public String getName() {
        return name;
    }
}
