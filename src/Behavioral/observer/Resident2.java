package observer;

/** This class is an observer of the elevator and is updated if the elevator button was pressed */
public class Resident2 implements Observer {

    @Override
    public void update() {
        System.out.println("Resident2 has been updated about elevator button being pressed");
    }

}