import java.util.Scanner;

public class SecondSmallest {

    public static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2)
            throw new IllegalArgumentException("Array must have at least 2 elements");

        int first = Integer.MAX_VALUE;   
        int second = Integer.MAX_VALUE;  

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MAX_VALUE)
            throw new RuntimeException("No second smallest element exists (all values equal)");

        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Second smallest = " + findSecondSmallest(arr));
        sc.close();
    }
}