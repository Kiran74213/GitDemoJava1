import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;       // get last digit
            reversed = reversed * 10 + digit; // append it to reversed
            num = num / 10;             // remove last digit
        }

        System.out.println("Reversed number: " + reversed);

        System.out.println("First");
        System.out.println("Second");
        System.out.println("Third");

        System.out.println("How");
        System.out.println("are");
        System.out.println("you");

        
    }
}
