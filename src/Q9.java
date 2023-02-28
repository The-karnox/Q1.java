import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a 10-digit number: ");
        long number = input.nextLong();
        
        // Extract digits from right to left
        int digit10 = (int) (number % 10);
        number /= 10;
        int digit9 = (int) (number % 10);
        number /= 10;
        int digit8 = (int) (number % 10);
        number /= 10;
        int digit7 = (int) (number % 10);
        number /= 10;
        int digit6 = (int) (number % 10);
        number /= 10;
        int digit5 = (int) (number % 10);
        number /= 10;
        int digit4 = (int) (number % 10);
        number /= 10;
        int digit3 = (int) (number % 10);
        number /= 10;
        int digit2 = (int) (number % 10);
        number /= 10;
        int digit1 = (int) (number % 10);
        
        // Calculate sum of products of digits and multipliers
        int sum = digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5
                + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9 + digit10 * 10;
        
        // Check if sum is divisible by 11
        if (sum % 11 == 0) {
            System.out.println("The number is a legal ISBN.");
        } else {
            System.out.println("The number is not a legal ISBN.");
        }
    }
}
