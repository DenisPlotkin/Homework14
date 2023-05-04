import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private Student headman;
    private final List<Student> studentList;
    private final List<String> taskList;
    private final List<Student> studentListWithCompleteTaskList;

    public StudentGroup(Student headman, List<Student> studentList, List<String> taskList) {
        this.headman = headman;
        this.studentList = studentList;
        this.taskList = taskList;
        this.studentListWithCompleteTaskList = new ArrayList<>();
    }

    public void changeHeadman(Student headman) {
        this.headman = headman;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void deleteStudent(Student student) {
        this.studentList.remove(student);
    }

    public void changeStudent(Student student, Student newStudent) {
        for (Student value : this.studentList) {
            if (value.equals(student)) {
                value.setId(newStudent.getId());
                value.setName(newStudent.getName());
                value.setSurname(newStudent.getSurname());
            }
        }
    }

    public void completeTasks(Student student) {
        for (Student value : studentList) {
            if (value.equals(student)) {
                studentListWithCompleteTaskList.add(student);
            }
        }
    }

    public void addTask(String task) {
        this.taskList.add(task);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "headman=" + headman +
                ", studentList=" + studentList +
                ", taskList=" + taskList +
                ", studentListWithCompleteTaskList=" + studentListWithCompleteTaskList +
                '}';
    }
}
