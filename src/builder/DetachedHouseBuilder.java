package builder;

public class DetachedHouseBuilder extends HouseBuilder {
    public DetachedHouseBuilder() {
        super("Detached");
        this.addHouseSize(2500);
        this.addNumOfRooms(4);
        this.addNumOfFloors(3);
        this.addPool(true);
        this.addBackyard(true);
        this.addBalcony(false);
    }

}
