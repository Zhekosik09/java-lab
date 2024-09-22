package task1;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(String id) {
        students.remove(id);
    }

    public void displayAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}