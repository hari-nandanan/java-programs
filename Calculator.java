import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("Enter the operation (+,-,*,/): ");
        char operation = input.next().charAt(0);
        calculate(a, b, operation);
    }
    public static void calculate(int a, int b, char operation) {
        int result = 0;

        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
            result = a / b;
        }
        System.out.println("Result: " + result);
    }
}


