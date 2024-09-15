public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.printf("Before change: a = %d, b = %d\n", a, b);

        int temp = a;
        a = b;
        b = temp;

        System.out.printf("After change: a = %d, b = %d\n", a, b);
    }
}