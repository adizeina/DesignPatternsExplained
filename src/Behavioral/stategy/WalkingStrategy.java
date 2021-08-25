package stategy;

/** This WalkingStrategy class is a subclass of TravelStrategy, being one method of a travel mean to go to a location*/
public class WalkingStrategy implements TravelStrategy{

    /** This method is being overridden from the interface of TravelStrategy*/
    public String methodOfTravel() {
        return "walking";

    }
}
