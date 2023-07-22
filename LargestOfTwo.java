import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("Largest: " + num1);
        }
        else if (num1 == num2) {
            System.out.println("Numbers are equal");

        } else {
            System.out.println("Largest: " + num2);
        }
    }
}
