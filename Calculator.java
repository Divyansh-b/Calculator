import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    System.out.println("Choose an operation: ");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (*)");
    System.out.println("4. Division (/)");

    System.out.print("Enter your choice (1-4): ");
    int choice = scanner.nextInt();

    scanner.close();
  }
}