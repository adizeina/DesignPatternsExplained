package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentIterator implements Iterator<Student> {

        private ArrayList<Student> students;
        private int indexKey;

        public StudentIterator(ArrayList<Student> s) {
            students = s;
            indexKey = 0;
        }

        @Override
        public boolean hasNext() {
            return indexKey < students.size();
        }

        @Override
        public Student next() {
            return students.get(indexKey++);
        }
    }

