import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int i; boolean flag = false;
        for (i=2; i<n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
            if (!flag){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }

    }
}