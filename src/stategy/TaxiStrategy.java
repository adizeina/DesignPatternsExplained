package stategy;

/** This TaxiStrategy class is a subclass of TravelStrategy, being one method of a travel mean to go to a location*/
public class TaxiStrategy implements TravelStrategy {

    /** This method is being overridden from the interface of TravelStrategy */
    public String methodOfTravel() {
        return "taking a taxi";

    }
}
