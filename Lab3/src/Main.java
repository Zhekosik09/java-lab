import task1.*;
import task2.*;
import task3.*;
import task4.*;
import task5.*;
import task6.*;
import task8.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Runnable[] tasks = {
                Main::task1,
                Main::task2,
                Main::task3,
                Main::task4,
                Main::task5,
                Main::task6,
                Main::task7,
                Main::task8
        };
        for(int t = 0; t < 8; t++) {
            System.out.println("Task "+ (1+t) +":");
            tasks[t].run();
        }
    }
    public static void task1() {
        StudentRegistry registry = new StudentRegistry();

        Student student1 = new Student("1", "John", "Henderson", 20, 36);
        Student student2 = new Student("2", "Michael", "Leonard", 26, 93);
        Student student3 = new Student("3", "Richard", "Mathews", 35, 125);

        registry.addStudent(student1);
        registry.addStudent(student2);
        registry.addStudent(student3);

        registry.displayAllStudents();

        registry.removeStudent("2");
        System.out.println("After removal:");
        registry.displayAllStudents();
    }

    public static void task2() {
        List<String> list = Arrays.asList("apple", "banana", "grapefruit", "peach");

        Collection<String> uniqueElements = UniqueElements.getUniqueElements(list);
        System.out.println("Unique elements: " + uniqueElements);

        Map<String, Integer> elementCounts = UniqueElements.getElementCounts(list);
        System.out.println("Element counts: " + elementCounts);
    }

    public static void task3() {
        Box<Integer> intBox = new Box<>();
        intBox.put(2006);
        System.out.println("Integer Box contains: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.put("Yevhen");
        System.out.println("String Box contains: " + strBox.get());
    }

    public static void task4() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Max Integer: " + findMaxMethods.findMax(intArray));

        String[] strArray = {"chnu", "iftkn", "IPZ"};
        System.out.println("Max String: " + findMaxMethods.findMax(strArray));
    }

    public static void task5() {
        Pair<Integer, String> a = new Pair<>(1, "Jayson");
        Pair<Integer, String> b = new Pair<>(2, "Michael");
        Pair<Integer, String> c = new Pair<>(3, "Robert");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Compare: ");
        System.out.println(a.compare(b));
        System.out.println();

        Pair<String, List<Integer>> a1 = new Pair<>("J", Arrays.asList(1, 2));
        Pair<String, List<Integer>> b1 = new Pair<>("M", Arrays.asList(3, 4));
        Pair<String, List<Integer>> c1 = new Pair<>("R", Arrays.asList(5, 6));

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println("Compare: ");
        System.out.println(c1.compare(b1));
    }

    public static double calculateTotalArea(List<? extends Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }

    public static void task6() {
        Circle a = new Circle(1);
        Rectangle b = new Rectangle(2, 2);
        Circle c = new Circle(10);
        System.out.println(a.getArea() + " " + b.getArea() + " " + c.getArea());
        List<Shape> shapes = new ArrayList<>();

        shapes.add(a);
        shapes.add(b);
        shapes.add(c);

        System.out.println(calculateTotalArea(shapes));
    }

    public static void addToList(List<? super Integer> list) {
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
    }

    public static void task7() {
        List<Integer> list1 = new ArrayList<>();
        addToList(list1);
        for (Integer i : list1) {
            System.out.print(i + " ");
        }
        System.out.println();


        List<Number> list2 = new ArrayList<>();
        addToList(list2);
        for (Number i : list2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog = new Dog();

        shelter.addAnimal(dog);
        Cat cat = new Cat();

        shelter.addAnimal(cat);
        Labrador labrador = new Labrador();
        shelter.addAnimal(labrador);

        shelter.printAnimalSounds();

        shelter.printDogSounds();
    }
}