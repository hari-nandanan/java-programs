import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int firstTerm = 0, secondTerm = 1, n, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        for (i=1; i<=n; i++){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
}}
