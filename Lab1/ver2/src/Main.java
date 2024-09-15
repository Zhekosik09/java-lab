import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.printf("The number %d is positive.\n", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.\n", number);
        } else {
            System.out.printf("The number %d is zero.\n", number);
        }
    }
}