package Singleton;

public class Singleton {
    private static Singleton single_instance = null;
    public String s;
    
    private Singleton(){
        s = "Singleton class";
    }

    // This is a static method that will create an instance of Singleton class
    public static Singleton getInstance(){
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance; 
    }
}
