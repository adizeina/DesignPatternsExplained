package builder;

/** This class  holds all the features of a standard semi-detached home, but the attributes can be personalized, based on client's wishes (in Main)*/
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
