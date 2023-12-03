package SortingStudents;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StudentList {
    List<Student> students;

    public StudentList(List<Student> students){
        this.students = students;
    }

    public void displayList(String message){
        System.out.println(message);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortStudents() {
        Collections.sort(students);
    }
}
