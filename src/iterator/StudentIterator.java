package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/** This class is an iterator class that will be used by the main class to iterate through the StudentDatabase not knowing how
 * the object (Student) was stored, just checking if it has a next and to iterate */

public class StudentIterator implements Iterator<Student> {

        private ArrayList<Student> students;
        private int indexKey;

        public StudentIterator(ArrayList<Student> s) {
            students = s;
            indexKey = 0;
        }

        /** This method is used to check if the arraylist has any more Student objects when iterating SstudentDatabase
         * @return True if the index is smaller than the arraylist size and false if the arraylist has no more Student object
         * */
        @Override
        public boolean hasNext() {
            return indexKey < students.size();
        }

        /** This method is used to return the student in the position "next" when iterating through it
        * @return Student object
         * */
        @Override
        public Student next() {
            return students.get(indexKey++);
        }
    }

