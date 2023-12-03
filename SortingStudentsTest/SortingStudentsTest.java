package SortingStudents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class SortingStudentsTest {
    @Test
    public void testSortingList() {
        // Tworzymy listę studentów
        List<Student> students = new ArrayList<>();
        students.add(new Student(18, 180.5, "Pawel", "Lewandowski"));
        students.add(new Student(24, 185.0, "Tomek", "Kowalski"));
        students.add(new Student(21, 170.5, "Piotr", "Kowalski"));
        students.add(new Student(27, 165.0, "Mateusz", "Nowak"));
        students.add(new Student(30, 185.5, "Bartosz", "Antczak"));

        // Tworzymy obiekt klasy StudentList
        StudentList studentList = new StudentList(students);

        // Początkowa lista przed sortowaniem
        List<Student> originalList = new ArrayList<>(students);

        // Początkowe porównanie
        Assertions.assertEquals(originalList, studentList.students, "Listy są sobie równe przed sortowaniem");

        // Sortowanie
        studentList.sortStudents();

        // Porównanie po sortowaniu
        Assertions.assertNotEquals(originalList, studentList.students, "Listy nie są sobie równe po sortowaniu");
    }
}