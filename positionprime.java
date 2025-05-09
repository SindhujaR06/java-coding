public class positionprime {
        public static void main(String[] args) {
            int number = 50113;
    
            // Step 1: Break the number into digits
            int[] digits = new int[10]; // assuming max 10 digits
            int count = 0;
    
            while (number > 0) {
                int digit = number % 10;  // get last digit
                digits[count] = digit;    // store in array
                number = number / 10;     // remove last digit
                count++;
            }
    
            // 5th digit from left is at position count - 5
            if (count >= 5) {
                int fifthDigit = digits[count - 5];
    
                // Step 2: Check if it's a prime number
                boolean isPrime = true;
    
                if (fifthDigit <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i < fifthDigit; i++) {
                        if (fifthDigit % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
    
                // Step 3: Show result
                System.out.println("5th digit from left is: " + fifthDigit);
                if (isPrime) {
                    System.out.println(fifthDigit + " is a Prime Number.");
                } else {
                    System.out.println(fifthDigit + " is NOT a Prime Number.");
                }
            } else {
                System.out.println("The number has less than 5 digits.");
            }
        }
    
}
