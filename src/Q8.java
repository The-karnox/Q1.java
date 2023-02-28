import java.util.*;


public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        
        int[] A = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        
        for (int i = 0; i < n - 1; i += 2) {
            int temp = A[i];
            A[i] = A[i + 1];
            A[i + 1] = temp;
        }
        
        System.out.println("Array after swapping consecutive elements: " + Arrays.toString(A));
    }
}
