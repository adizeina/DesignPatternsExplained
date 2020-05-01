package stategy;

/** This DriverStrategy class is a subclass of TravelStrategy, being one method of a travel mean to go to a location*/
public class DrivingStrategy implements TravelStrategy {

    /** This method is being overridden from the interface of TravelStrategy */
    public String methodOfTravel() {
        return "driving";

    }
}
