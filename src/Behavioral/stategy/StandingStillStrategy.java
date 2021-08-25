package stategy;

/** This StandingStillStrategy class is a subclass of TravelStrategy, being one method of a travel mean to go to a location. This is the standard
 * method used by the person if the kilometers of travel is equal to 0  */

public class StandingStillStrategy implements TravelStrategy {

    /** This method is being overridden from the interface of TravelStrategy */
    public String methodOfTravel() {
        return "doing nothing";

    }
}
