package observer;

import java.util.ArrayList;

/** This observable class that is extended by objects that will be observed by the observers. */
public class Observable {

    /** This arraylist keeps track of all the observers */
    private ArrayList<Observer> observers = new ArrayList<>();

    /** This adds an abserver to the arraylist of observers created */
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    /** This deletes an abserver to the arraylist of observers */
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /** This method deletes all observers attached to the observable objects*/
    public void deleteObservers(){
        this.observers.clear();
    }

    /** This method updates every observer attached to the observable of the change*/
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
