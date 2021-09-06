package Singleton;

public class hashIt {
    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Hashcode of s1 is " + s1.hashCode());
        System.out.println("Hashcode of s2 is " + s2.hashCode());
    

    if (s1 == s2) {
        System.out.println(
            "Both objects point to the same memory location on the heap");
    }
    else {
        // Print statement
        System.out.println(
            "The objects DO NOT point to the same memory location on the heap");
    }
    
}
}
