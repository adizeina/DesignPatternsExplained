package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDatabase implements Iterable<Student> {

        ArrayList<Student> students;


	public StudentDatabase() {
            students = new ArrayList<>();
        }

        public void add(String firstName, String lastName, int studentNumber, String programEnrolled) {
            students.add(new Student(firstName, lastName, studentNumber, programEnrolled));
        }

        @Override
        public Iterator<Student> iterator() {
            return new StudentIterator(students);
        }
    }

