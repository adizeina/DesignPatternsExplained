package builder;

import java.util.Enumeration;

public class House {
    private String typeOfHouse;
    private int numOfFloors, numOfRooms, sizeOfHome;
    private boolean hasBackyard, hasBalcony, hasPool;


    public House(String typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setSizeOfHome(int sizeOfHome) {
        this.sizeOfHome = sizeOfHome;
    }

    public void setHasBackyard(boolean backyard) {
        this.hasBackyard = backyard;
    }

    public void setHasPool(boolean pool) {
        this.hasPool = pool;
    }
    public void setHasBalcony(boolean balcony) {
        this.hasBalcony = balcony;
    }

    public String toString() {
        return typeOfHouse + ": " + "Its size is " + sizeOfHome +
                " It has " + numOfRooms + " rooms and has " + numOfFloors +
                " floors. Pool = " + hasPool + " Balcony = " + hasBalcony + " Backyard = " + hasBackyard;
    }
}

