import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What letter does your first name start with?");
        char initial = scanner.next().charAt(0);
        System.out.println("What is your surname?");
        String Surname = scanner.next();
        System.out.println("What age are you?");
        int age = scanner.nextInt();
        System.out.println("What is your current salary?");
        double salary = scanner.nextDouble();
        System.out.println("Your are currently employed True/False?");
        boolean isEmployed = scanner.nextBoolean();

        System.out.println(initial + Surname + "is " + age + " years old, is currently " + (isEmployed ? "employed " : "not employed ") + "and has a salary of " + salary + " per year ");
        scanner.close();
    }
}
