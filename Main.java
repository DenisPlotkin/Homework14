import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Denis", "Plotkin");
        Student student2 = new Student(2, "Oleg", "Gorobets");
        Student student3 = new Student(3, "Denis", "Dain");
        Student student4 = new Student(4, "Oleksandr", "Miroshnichenko");
        Student student5 = new Student(5, "Ivan", "Homa");
        List<Student> studentList1 = new ArrayList<>();
        List<String> taskList1 = new ArrayList<>();

        StudentGroup studentGroup1 = new StudentGroup(student1, studentList1, taskList1);
        System.out.println(studentGroup1);
        studentGroup1.changeHeadman(student3);
        System.out.println(studentGroup1);
        studentGroup1.addStudent(student1);
        studentGroup1.addStudent(student2);
        studentGroup1.addStudent(student4);
        studentGroup1.addStudent(student5);
        System.out.println(studentGroup1);
        studentGroup1.deleteStudent(student2);
        System.out.println(studentGroup1);
        studentGroup1.changeStudent(student1, new Student(1_000_000, "Harry", "Potter"));
        System.out.println(studentGroup1);
        studentGroup1.addTask("Зробити проект");
        studentGroup1.addTask("Сходити на вечірку");
        studentGroup1.addTask("Захистити диплом");
        System.out.println(studentGroup1);
        studentGroup1.completeTasks(student4);
        System.out.println(studentGroup1);

    }
}
