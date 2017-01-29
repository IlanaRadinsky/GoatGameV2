package goatgamev2;

/**
 * Created by ilana on 1/27/2017.
 */
public class GameShowHost {
    public static int goatDoor;

    public Player currentPlayer;
    Door.Prize finalPrize;

    public Door[] doors = new Door[3];

    public GameShowHost(Player a) {
        currentPlayer = a;
        System.out.println("New GameShowHost created!\n");
    }
    public void initializeGame() {
        Door.reset();

        System.out.println("/*For GameShowHost viewing only:");

        for(int j = 0; j<3; j++) {
            doors[j] = new Door();
            System.out.println("Door " + doors[j].getDoorNum() + ": " + doors[j].getPrize());
        }

        System.out.println("*/\n");

        System.out.println(currentPlayer.getName() + ", welcome to the Goat Game!");
        System.out.println("Here is the way the game works:");
        System.out.println("There are three doors.\nBehind two of the doors, there is a goat.\nBehind the one remaining door, there is a sports car.");
        System.out.println("You, " + currentPlayer.getName() + ", will be asked to choose a door.");
        System.out.println("Whatever is behind the door that you select - either a goat, or a sports car - you will receive as your prize!");
        System.out.println("Let's begin!");
    }

    public void revealGoatDoor() {
        for(int i =0; i<3; i++) {
            if(i!=(currentPlayer.getCurrentDoor()-1) && doors[i].getPrize() == Door.Prize.GOAT) {
                goatDoor = doors[i].getDoorNum();
                doors[i].openDoor();
                break;
            }
        }
    }

    public void play() {
        initializeGame();

        System.out.println(currentPlayer.getName() + ", please pick a door!");

        currentPlayer.selectInitialDoor();

        System.out.println(currentPlayer.getName() + " has selected Door " + currentPlayer.getCurrentDoor() + "!");
        System.out.println("I am now going to open one of the other two doors!");

        revealGoatDoor();

        System.out.println("Behind Door " + goatDoor + ", there is...\n a GOAT!");
        System.out.println("Based on this new information, please select one of the two remaining doors! You may choose to keep your original choice of door.");

        currentPlayer.selectNewDoor();

        System.out.println(currentPlayer.getName() + " has selected Door " + currentPlayer.getCurrentDoor() + "!");
        System.out.println("Okay! Let's see what's behind your door!");

        finalPrize = doors[currentPlayer.getCurrentDoor()-1].openDoor();

        System.out.println(currentPlayer.getName() + ", you have won...");
        System.out.println(" a " + finalPrize + "!\nCongratulations!");
    }
}
