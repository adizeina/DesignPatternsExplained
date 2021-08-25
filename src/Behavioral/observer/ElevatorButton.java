package observer;

public class ElevatorButton extends Observable {
    private boolean elevatorButtonUp = true;

    /** This class is an observer of the elevator and is updated if the elevator button was pressed to go up*/
    public void goingUp() {
        if (this.elevatorButtonUp == false) {
            this.elevatorButtonUp = true;
            System.out.println("Elevator button pressed to go up!");
            this.notifyObservers();
        }
    }

    /** This class is an observer of the elevator and is updated if the elevator button was pressed to go down*/
    public void goingDown() {
        if (this.elevatorButtonUp == true) {
            this.elevatorButtonUp = false;
            System.out.println("Elevator button pressed to go down!");
            this.notifyObservers();
        }
    }
}

