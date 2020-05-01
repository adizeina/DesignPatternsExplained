package observer;

/** This class is a main class, which creates elevator button objects(the observable) and observer objects that are attached to the
 * observable objects. When the elevator button is pushed up or down, the resident attached to the button will be alerted of the updated */

public class Main {
    public static void main(String[] args) {
        ElevatorButton b1 = new ElevatorButton();
        ElevatorButton b2 = new ElevatorButton();
        ElevatorButton b3 = new ElevatorButton();

        Resident1 res1 = new Resident1();
        Resident2 res2 = new Resident2();
        Resident3 res3 = new Resident3();

        b1.addObserver(res1);


        b2.addObserver(res1);
        b2.addObserver(res2);
        b2.addObserver(res3);
        b2.deleteObserver(res1);

        b3.addObserver(res1);
        b3.addObserver(res2);
        b3.addObserver(res3);
        b3.deleteObservers();

        b1.goingDown();
        b2.goingDown();
        b2.goingUp();
        b3.goingDown();
    }
}

