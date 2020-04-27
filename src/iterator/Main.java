package iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        StudentDatabase theStudents = new StudentDatabase();

        theStudents.add("Sarah", "Smith", 100500300, "Life Science");
        theStudents.add("Adam", "Brown", 100500327, "Computer Science");
        theStudents.add("Nick", "Adams", 100988322, "Mathematics");


        Iterator<Student> it = theStudents.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

