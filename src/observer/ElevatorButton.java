package observer;

public class ElevatorButton extends Observable {
    private boolean elevatorButtonUp = true;

    public void goingUp() {
        if (this.elevatorButtonUp == false) {
            this.elevatorButtonUp = true;
            System.out.println("Elevator button pressed to go up!");
            this.notifyObservers();
        }
    }

    public void goingDown() {
        if (this.elevatorButtonUp == true) {
            this.elevatorButtonUp = false;
            System.out.println("Elevator button pressed to go down!");
            this.notifyObservers();
        }
    }
}

