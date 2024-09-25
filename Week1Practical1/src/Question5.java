import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        System.out.println("Enter another number");
        int b = scanner.nextInt();

        System.out.println("Sum equals " + (a + b));
        System.out.println("Difference equals " + (a - b));
        System.out.println("Product equals " + (a * b));
        System.out.println("Quotient equals " + (a / b));
        scanner.close();
    }
}