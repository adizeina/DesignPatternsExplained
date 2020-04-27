package observer;

public class Resident3 implements Observer {

    @Override
    public void update() {
        System.out.println("Resident3 has been updated about elevator change");
    }
}
