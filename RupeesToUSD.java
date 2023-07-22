import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in Rupees: ");
        float rupee = input.nextFloat();

        float dollar = (float) (0.012 * rupee);
        System.out.println("Amount in USD: " + dollar);
    }
}
