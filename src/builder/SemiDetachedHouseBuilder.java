package builder;

public class SemiDetachedHouseBuilder extends HouseBuilder {
    public SemiDetachedHouseBuilder() {
        super("Semi-Detached");
        this.addHouseSize(1800);
        this.addNumOfRooms(3);
        this.addNumOfFloors(3);
        this.addPool(false);
        this.addBackyard(true);
        this.addBalcony(false);
    }
}
