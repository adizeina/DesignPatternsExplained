package builder;


/** This class House contains all the standard attributes of a general home */

public class House {

    /** These are the attributes that a home contains like the number of floors it has, number of rooms, whether it has a pool ...etc*/
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

    /**
     * Return string used for ToString representation
     * @return a string describing whether or not house built includes a pool or not
     */
    public String printPool(){
        if (hasPool == true)
            return " has a pool, ";
        else{
            return " does not have a pool, ";
        }
    }

    /**
     * Return string used for ToString representation
     * @return a string describing whether or not house built includes a backyard or not
     */
    public String printBalcony(){
        if (hasBalcony == true)
            return " has a balcony and ";
        else{
            return " does not have a balcony and ";
        }
    }

    /**
     * Return string used for ToString representation
     * @return a string describing whether or not house built includes a backyard or not
     */
    public String printBackyard(){
        if (hasBackyard == true)
            return "has a backyard!";
        else{
            return "does not have a backyard!";
        }
    }

    public void setHasBalcony(boolean balcony) {
        this.hasBalcony = balcony;
    }

    /**
     * When creating a house using HouseBuilder, we turn it into a house object and printing it will result in this string representation
     * @return the string representation of this Event.
     */
    public String toString() {
        return "The " + typeOfHouse + " is of a size of " + sizeOfHome + ". It has " + numOfRooms + " rooms and " + numOfFloors +
                " floors. The " + typeOfHouse + printPool() + printBalcony() + printBackyard();
    }
}

