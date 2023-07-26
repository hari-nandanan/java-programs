import java.util.Scanner;

public class DifferenceProductSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = Integer.toString(n);
        int len = str.length();

        int i; int p = 1; int s = 0;
        for (i=0; i<len; i++){
            int a = str.charAt(i)-48;
            p = p * a;
            s = s + a;
        }
        int result = p - s;
        System.out.println(result);
    }
}
