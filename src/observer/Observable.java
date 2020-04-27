package observer;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void deleteObservers(){
        this.observers.clear();
    }


    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
