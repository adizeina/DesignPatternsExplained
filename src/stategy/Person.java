package stategy;

public class Person {

    private String name;
    private String locationOfChoice;
    private boolean hasCar;
    private int distanceForLocation;
    private TravelStrategy strategy;

    public Person(String name, String location, boolean hasCar, int distance) {
        this.name = name;
        this.locationOfChoice = location;
        this.hasCar = hasCar;
        this.distanceForLocation = distance;      //in kilometers
        this.strategy = new StandingStillStrategy();
    }
    void personHasCar() {
        if ((hasCar == true) && (distanceForLocation != 0)) {
            setStrategy(new DrivingStrategy());

        }else{
            determineAppropriateStrategy();
        }
    }

    void determineAppropriateStrategy(){
        if (this.distanceForLocation == 0){
            setStrategy(new StandingStillStrategy());
        }
        else if ((this.distanceForLocation >0) && (this.distanceForLocation < 5)){
            setStrategy(new WalkingStrategy());
        }
        else if ((this.distanceForLocation > 4) && (this.distanceForLocation < 15)){
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

    void move() {
        String travelMethod = this.strategy.methodOfTravel();
        System.out.print(name + " will be " + travelMethod + " to get to the " + locationOfChoice);
    }
    public static void main(String[] args) {

        Person person = new Person("Daren Williams", "Bahamas", true, 9);
        person.personHasCar();
        person.move();
    }
}

