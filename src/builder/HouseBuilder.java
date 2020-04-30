package builder;

/** This class HouseBuilder extends to different types of houses.
 * @author zeina*/
public class HouseBuilder {

    /** This class House contains all the standard attributes of a general home */
    private String typeOfHouse;
    private int numOfFloors;
    private int numOfRooms;
    private int sizeOfHome;
    private boolean backyard = false;
    private boolean balcony = false;
    private boolean pool = false;

    /** This constructor requires a name which is the type of house to be build*/
    public HouseBuilder(String name) {
        this.typeOfHouse = name;
    }

    public void addNumOfFloors(int numOfFloors) {
        this.numOfFloors =numOfFloors;
    }
    public void addHouseSize(int sizeInSqft) {
        this.sizeOfHome = sizeInSqft;
    }
    public void addNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void addPool(boolean answer) {
        this.pool = answer;
    }
    public void addBalcony(boolean answer) {
        this.balcony = answer;
    }

    public void addBackyard(boolean answer) {
        this.backyard = answer;
    }

    /** This class House contains all the standard attributes of a general home */
    public House getHouse() {
        House h = new House(this.typeOfHouse);
        h.setNumOfFloors(numOfFloors);
        h.setNumOfRooms(numOfRooms);
        h.setSizeOfHome(sizeOfHome);
        h.setHasBackyard(backyard);
        h.setHasBalcony(balcony);
        h.setHasPool(pool);
        return h;
    }
}
