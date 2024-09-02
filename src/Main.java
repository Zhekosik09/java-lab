import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        MainMenu();
    }



    public static void  MainMenu() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nLab-1\nSelect a task: ");
        int num = in.nextInt();
        switch (num) {
            case 1: SwapNumber();
            case 2: CheckNumber();
            case 3: CheckWeek();
            case 4: NumberCycle();
            case 5: TwoDimArray();
        }
    }
    public static void SwapNumber() {
        int a = 5;
        int b = 10;
        System.out.printf("Before change: a = %d, b = %d\n", a, b);

        int temp = a;
        a = b;
        b = temp;

        System.out.printf("After change: a = %d, b = %d\n", a, b);
        MainMenu();
    }
    public static void CheckNumber() {
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
        MainMenu();
    }
    public static void CheckWeek() {
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
        MainMenu();
    }
    public static void NumberCycle() {
        int i = 1;
        while (i < 11) {
            System.out.printf("%d ", i);
            i++;
        }
        System.out.println("");
        MainMenu();
    }
    public static void TwoDimArray() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.printf("Sum: %d\n", sum);
        MainMenu();
    }
}