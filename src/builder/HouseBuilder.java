package builder;

public class HouseBuilder {

    private String typeOfHouse;
    private int numOfFloors;
    private int numOfRooms;
    private int sizeOfHome;
    private boolean backyard = false;
    private boolean balcony = false;
    private boolean pool = false;

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
