package builder;

import java.util.ArrayList;

public class HouseOwner {
    private HouseBuilder builder;
    private ArrayList<House> houses = new ArrayList<>();

    public HouseOwner() {
    }

    public void construct() {

        builder = new ApartmentBuilder();
        builder.addPool(false);
        houses.add(builder.getHouse());
        houses.add(builder.getHouse());
        builder = new DetachedHouseBuilder();
        houses.add(builder.getHouse());
        houses.add(builder.getHouse());
        houses.add(builder.getHouse());
    }

    public ArrayList<House> getHouses() {
        return this.houses;
    }
}
