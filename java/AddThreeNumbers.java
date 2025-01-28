import java.util.Scanner;
public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        double totalSum = num1 + num2 + num3;
        System.out.println("The total sum of the three numbers is: " + totalSum);
        scanner.close();
    }
}