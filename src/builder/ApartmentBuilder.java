package builder;

/** This class  holds all the features of a standard apartment, but the attributes can be personalized, based on client's wishes(in Main)*/

public class ApartmentBuilder extends HouseBuilder {
    public ApartmentBuilder() {
        super("Apartment");
        this.addHouseSize(1200);
        this.addNumOfRooms(2);
        this.addNumOfFloors(1);
        this.addPool(true);
        this.addBackyard(false);
        this.addBalcony(true);
    }
}
