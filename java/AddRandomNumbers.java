import java.util.Random;
class AddRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100) + 1; 
        int num2 = random.nextInt(100) + 1; 
        int sum = num1 + num2;
        System.out.println("First random number: " + num1);
        System.out.println("Second random number: " + num2);
        System.out.println("Sum of the two numbers: " + sum);
    }
}