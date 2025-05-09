public class arr {
        public static void main(String[] args) {
            int[] arr = {10, -5, 3, -2, 8};
    
            System.out.println("Positive numbers in the array:");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    continue; // Skip negative numbers
                }
                System.out.print(arr[i] + " ");
            }
        }
    
}
