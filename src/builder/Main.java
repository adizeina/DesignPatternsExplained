package builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        HouseBuilder apartment = new HouseBuilder("Apartment");   // thats 1 way to implement it and it will give you 0 info about appartement unless you give them EX.
        apartment.addHouseSize(1200);
        House h1 = apartment.getHouse();
        System.out.println(h1);

        HouseBuilder semi = new SemiDetachedHouseBuilder();
        House h2 = semi.getHouse();
        System.out.println(h2);

        HouseBuilder deluxeBuilder = new DetachedHouseBuilder();
        House h3 = deluxeBuilder.getHouse();
        System.out.println(h3);
//
        // use the director to construct a bunch of pizza
        HouseOwner owner = new HouseOwner();
        owner.construct();
        ArrayList<House> houses = owner.getHouses();

        for (House h : houses) {
            System.out.println(h);
        }


}
}
