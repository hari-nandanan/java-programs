import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i;
        for(i=1; i<=n; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
}
