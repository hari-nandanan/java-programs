import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.next();
        int length = word.length();

        int i; String rev = "";
        for(i=0; i<length; i++){
            rev = rev + word.charAt(length-1-i);

        }
        if (word.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

}


////algorithm
//input the string
//reverse the string
//compare reversed = original