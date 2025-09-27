package test;
import java.util.Scanner;

class ExceptionHandling {
    public void performDivision() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero is invalid");
            
            performDivision();
        }
    }
}

public class Division {
    public static void main(String[] args) {
        ExceptionHandling excp = new ExceptionHandling();
        excp.performDivision;
    }
}