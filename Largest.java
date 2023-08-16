import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if (a < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
            System.out.println("Largest: "+max);
        }
    }

