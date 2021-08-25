package observer;

/** This class is an observer of the elevator and is updated if the elevator button was pressed */
public class Resident1 implements Observer {

    @Override
    public void update() {
        System.out.println("Resident1 has been updated about elevator button being pressed");
    }
}
