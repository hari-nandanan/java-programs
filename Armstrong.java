import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int i, a, b =0;
        String str = Integer.toString(number);
        int length = str.length();

        for (i=0; i<length; i++) {
            a = str.charAt(i) - '0';
            b = b + (int) Math.pow(a, length);

        }
            if (b == number){
                System.out.println("Armstrong");
            }
            else {
                System.out.println("Not Armstrong");
        }
            
        }
    }

