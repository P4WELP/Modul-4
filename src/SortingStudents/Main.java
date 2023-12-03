package SortingStudents;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(18, 180.5, "Pawel", "Lewandowski"));
        students.add(new Student(24, 185.0, "Tomek", "Kowalski"));
        students.add(new Student(21, 170.5, "Piotr", "Kowalski"));
        students.add(new Student(27, 165.0, "Mateusz", "Nowak"));
        students.add(new Student(30, 185.5, "Bartosz", "Antczak"));

        StudentList studentList = new StudentList(students);

        studentList.displayList("Lista przed sortowaniem:");

        studentList.sortStudents();

        studentList.displayList("\nLista po sortowaniu:");
    }
}