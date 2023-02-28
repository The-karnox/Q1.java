import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the sequence (n > 3): ");
        int n = input.nextInt();
        
        // Initialize the first three terms of the sequence
        int a = 0;
        int b = 1;
        int c = 1;
        
        System.out.print("The sequence is: " + a + " " + b + " " + c);
        
        // Generate the remaining terms of the sequence using the sum of three predecessors
        for (int i = 3; i < n; i++) {
            int nextTerm = a + b + c;
            System.out.print(" " + nextTerm);
            a = b;
            b = c;
            c = nextTerm;
        }
    }
}

