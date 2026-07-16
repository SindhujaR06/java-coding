import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int result = 0;

        // Loop through digits
        while (num > 0) {
            int digit = num % 10;          // get last digit
            result += digit * digit * digit; // cube of digit
            num = num / 10;               // remove last digit
        }

        // Check Armstrong condition
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number");
        }

        sc.close();
    }
}
