package observer;

public class Resident1 implements Observer {

    @Override
    public void update() {
        System.out.println("Resident1 has been updated about elevator change");
    }
}
