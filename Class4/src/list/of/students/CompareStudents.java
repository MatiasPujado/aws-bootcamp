package list.of.students;

import java.util.Comparator;

public class CompareStudents {

    /**
     * Sorts students by age in ascending order
     */
    public static Comparator<Student> sortByAgeAsc = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    };

    /**
     * Sorts students by age in descending order
     */
    public static Comparator<Student> sortByAgeDesc = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getAge().compareTo(o1.getAge());
        }
    };
}
