package builder;

/** This class  holds all the features of a standard detached home, but the attributes can be personalized, based on client's wishes (in Main)*/

public class DetachedHouseBuilder extends HouseBuilder {
    public DetachedHouseBuilder() {
        super("Detached House");
        this.addHouseSize(2500);
        this.addNumOfRooms(4);
        this.addNumOfFloors(3);
        this.addPool(true);
        this.addBackyard(true);
        this.addBalcony(false);
    }

}
