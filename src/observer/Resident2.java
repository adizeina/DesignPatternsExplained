package observer;

public class Resident2 implements Observer {

    @Override
    public void update() {
        System.out.println("Resident2 has been updated about elevator change");
    }

}