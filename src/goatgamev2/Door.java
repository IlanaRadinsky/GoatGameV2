package goatgamev2;

import java.util.Random;

/**
 * Created by ilana on 1/27/2017.
 */
public class Door {
    public static int totalNumDoors = 0;
    public static int numGoats = 0;
    public static int numCars = 0;

    public boolean isOpen = false;
    public int doorNum;
    public boolean validDoor;
    public Prize prize;

    public enum Prize {
        GOAT,
        SPORTSCAR
    }

    public static void reset() {
        totalNumDoors = 0;
        numGoats = 0;
        numCars = 0;
    }

    public Door() {
        if(totalNumDoors<3) {
            totalNumDoors++;
            doorNum = totalNumDoors;
            validDoor = true;

            Random rnd;
            int x;
            while(prize==null) {
                rnd = new Random();
                x = rnd.nextInt(3);
                if ((x == 0 || x == 1) && numGoats < 2) {
                    prize = Prize.GOAT;
                    numGoats++;
                } else if (x == 2 && numCars<1) {
                    prize = Prize.SPORTSCAR;
                    numCars++;
                }
            }

        } else {
            validDoor = false;
            System.out.println("Error: Cannot create more than 3 doors");
        }
    }

    public int getDoorNum(){
        if(validDoor==true){
            return doorNum;
        } else {
            System.out.println("Error: Invalid Door");
            return -1;
        }
    }

    public boolean isValidDoor() {
        return validDoor;
    }

    public int getTotalNumDoors() {
        return totalNumDoors;
    }

    public Prize getPrize() {
        if(validDoor==true){
            return prize;
        } else {
            System.out.println("Error: Invalid Door");
            return null;
        }
    }

    public Prize openDoor() {
        /* openDoor() and getPrize() are pretty much the same.
        The only difference is that openDoor() changes isOpen to true,
        as well as returning the prize like getPrize() does.
        I never really make use of the isOpen boolean in my code,
        so it's kind of unnecessary to have both these methods,
        but I thought it was important to have a way of keeping
        track of if each door is open or closed. If I would ever want
        to use my Door class in a different way in a different version of the program,
        it is very likely that it would be important to know whether
        the door had already been opened or not.
         */
        if(validDoor==true){
            isOpen = true;
            return prize;
        } else {
            System.out.println("Error: Invalid Door");
            return null;
        }
    }
}
