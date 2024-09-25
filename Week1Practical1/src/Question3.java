import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueInput;
        do {
            System.out.println("Enter a number");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }

            System.out.println("Do you wish to continue Y/N?");
            continueInput = scanner.next().charAt(0);
        } while (continueInput == 'Y' || continueInput == 'y');
        scanner.close();
    }
}
