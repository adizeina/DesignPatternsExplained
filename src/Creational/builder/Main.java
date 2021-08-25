package builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. this is one way to build a home it and since a subclass builder wasnt called upon, it will take the unedited attributes of a home, so no pool
        // no backyard, no room, no floor, the square footing is there because we added it, same with the name.

        HouseBuilder apartment = new HouseBuilder("Shay's Apartment");
        apartment.addHouseSize(1300);
        House h1 = apartment.getHouse();
        System.out.println(h1);

        HouseBuilder semi = new SemiDetachedHouseBuilder();
        House h2 = semi.getHouse();
        System.out.println(h2);

        HouseBuilder deluxeBuilder = new DetachedHouseBuilder();
        House h3 = deluxeBuilder.getHouse();
        System.out.println(h3);


        //2. Another way to build a house, by calling on the HouseOwner, instead of house builder --> using OOP and not dependent on one way of using code
        HouseOwner owner = new HouseOwner();
        owner.construct();
        ArrayList<House> houses = owner.getHouses();

        // this will print out the houses made by the Owner
        for (House h : houses) {
            System.out.println(h);
        }
    }

}

