package task1;

public class Student {
    private String id;
    private String name;
    private String surname;
    private int age;
    private int score;

    public Student(String id, String name, String surname, int age, int score) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.score = score;
    }

    public String getId() { return id; }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + " " + surname + "', age=" + age + "', score='" + score + "}";
    }
}
