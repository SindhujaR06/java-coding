public class positiondigit {
      public static void main(String[] args) {
            int number = 234571;
    
            // Step 1: Break the number into digits
            int[] digits = new int[10]; // assuming max 10 digits
            int count = 0;
    
            while (number > 0) {
                int digit = number % 10;      // get last digit
                digits[count] = digit;        // store in array
                number = number / 10;         // remove last digit
                count++;
            }
    
            // Digits are stored in reverse, so 5th digit from left is at position count - 5
            if (count >= 4) {
                int fourthDigit = digits[count - 4];
    
                // Step 2: Find factorial of the 5th digit
                int fact = 1;
                for (int i = 1; i <= fourthDigit; i++) {
                    fact = fact * i;
                }
    
                // Step 3: Show result
                System.out.println("4th digit from left is: " + fourthDigit);
                System.out.println("Factorial of " + fourthDigit + " is: " + fact);
            } else {
                System.out.println("The number has less than 5 digits.");
            }
        }
    
}
