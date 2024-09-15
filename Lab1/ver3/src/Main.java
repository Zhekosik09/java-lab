import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        int number = scanner.nextInt();
        String week = " ";

        switch (number) {
            case 1: week = "Sunday"; break;
            case 2: week = "Monday"; break;
            case 3: week = "Tuesday"; break;
            case 4: week = "Wednesday"; break;
            case 5: week = "Thursday"; break;
            case 6: week = "Friday"; break;
            case 7: week = "Saturday"; break;
        }

        System.out.printf("Day of the week: %s\n", week);
    }
}