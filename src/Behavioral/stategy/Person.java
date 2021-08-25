package stategy;

/** This Person class holds the attribute for the person's travel strategy detail to lead to the the type of method they could use to arrive at their
 * destination, by asking them if they have a car, their destination, how far they are from it to access the best method.  */
public class Person {

    private String name;
    private String destination;
    private boolean hasCar;
    private int distanceTillDestination;
    private TravelStrategy strategy;

    /** This is the class's constructor */
    public Person(String name, String location, boolean hasCar, int distance) {
        this.name = name;
        this.destination = location;
        this.hasCar = hasCar;
        this.distanceTillDestination = distance;      //in kilometers
        this.strategy = new StandingStillStrategy();
    }

    /** This method sets the method of travel to be driving to destination if the distanceTillDestination is not zero and the person has a car,
     * if the person doesnt have a car, another strategy to arrive at the destination must be assessed using the distanceTillLocation.
     * @return void
     * */
    void personHasCar() {
        if ((hasCar == true) && (distanceTillDestination != 0)) {
            setStrategy(new DrivingStrategy());

        }else{
            determineAppropriateStrategy();
        }
    }

    /** This method will determine the method of travel a person must use if they don't have a car and it's based on distance. In this scenario,
     * if the person is less than 2 km of distance from destination then they should walk, between 2-15 km to take a taxi as it is cheaper but if
     * the distance is more that 15km then the person should take an uber.
     *  */
    void determineAppropriateStrategy(){
        if (this.distanceTillDestination == 0){
            setStrategy(new StandingStillStrategy());
        }
        else if ((this.distanceTillDestination >0) && (this.distanceTillDestination < 3)){
            setStrategy(new WalkingStrategy());
        }
        else if ((this.distanceTillDestination> 2) && (this.distanceTillDestination < 15)){
            setStrategy(new TaxiStrategy());
        }
        else{
            setStrategy(new UberStrategy());
        }
    }

    void setStrategy(TravelStrategy strategy) {
        System.out.println("Setting strategy...");
        this.strategy = strategy;
    }

    /** This will be a representation of what means of transport is chosen for that person's destination and circumstances, to be printed out*/
    void ToString() {
        String travelMethod = this.strategy.methodOfTravel();
        System.out.print(name + " will be " + travelMethod + " to get to the " + destination);
    }

    /** This is the main method*/
    public static void main(String[] args) {

        Person person = new Person("Daren Williams", "Bahamas", true, 9);
        person.personHasCar();
        person.ToString();
    }
}

