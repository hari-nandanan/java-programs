import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        float p = input.nextFloat();
        System.out.print("Enter the Rate in %: ");
        float r = input.nextFloat();
        System.out.print("Enter the Time in years: ");
        float t = input.nextFloat();
        float simple_interest = (p * r * t)/100;
        System.out.println("Simple Interest: " + simple_interest);
    }
}
