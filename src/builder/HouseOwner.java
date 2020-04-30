package builder;

import java.util.ArrayList;

/** This is another way of constructing a home instead of solely using House and HouseBuilder. This class constructs a home, using the HouseBuilder
 * class and adds the home to the arraylist of houses */
public class HouseOwner {
    private HouseBuilder builder;
    private ArrayList<House> houses = new ArrayList<>();

    public HouseOwner() {
    }
    /**This method uses the subclasses of HouseBuilder classes to build the houses  to  and is able to ajust the features of the home and
     * add it to the arraylist of home
     * @return void
     * */
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
    /**This method returns all the houses built stores in the arraylist
     * @return Arraylist of houses
     * */
    public ArrayList<House> getHouses() {
        return this.houses;
    }
}
