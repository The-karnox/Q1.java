import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, product = 1;

        // calculate sum and product of digits
        while(num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        // check if number is spy number
        if(sum == product) {
            System.out.println("The number is a spy number");
        } else {
            System.out.println("The number is not a spy number");
        }
    }
}
