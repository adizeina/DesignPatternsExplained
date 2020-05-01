package stategy;

/** This UberStrategy class is a subclass of TravelStrategy, being one method of a travel mean to go to a location*/
public class UberStrategy implements TravelStrategy{

    /** This method is being overridden from the interface of TravelStrategy */
    public String methodOfTravel() {
        return "ubering";

    }
}
