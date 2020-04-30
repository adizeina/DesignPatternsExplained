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
    public String pool(){
        if (hasPool == true)
            return " has a pool, ";
        else{
            return " does not have a pool, ";
        }

    }
    public String balcony(){
        if (hasBalcony == true)
            return " has a balcony and ";
        else{
            return " does not have a balcony and ";
        }

    }
    public String backyard(){
        if (hasBackyard == true)
            return "has a backyard!";
        else{
            return "does not have a backyard!";
        }

    }

    public void setHasBalcony(boolean balcony) {
        this.hasBalcony = balcony;
    }

    public String toString() {
        return "The " + typeOfHouse + " is of a size of " + sizeOfHome + ". It has " + numOfRooms + " rooms and " + numOfFloors +
                " floors. The " + typeOfHouse + pool() + balcony() + backyard();
    }
}

