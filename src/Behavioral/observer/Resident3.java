package observer;

/** This class is an observer of the elevator and is updated if the elevator button was pressed */
public class Resident3 implements Observer {

    @Override
    public void update() {
        System.out.println("Resident3 has been updated about elevator button being pressed");
    }
}
