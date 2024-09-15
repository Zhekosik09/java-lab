import java.util.ArrayList;
import java.util.Iterator;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private int age;
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            person.setAge(25);
            System.out.println("Age is set to: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(15);
        ages.add(20);
        ages.add(17);
        ages.add(25);
        Iterator<Integer> iterator = ages.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 18) {
                iterator.remove();
            }
        }
        for (int age : ages) {
            System.out.println(age);
        }
    }
}

