import java.util.*;
 public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
    double x = sc.nextDouble(); // input value of x
    System.out.println("Enter n: ");
    int n = sc.nextInt(); // number of terms to compute
    double sum = 1.0; // initialize sum to first term (i.e., n=0)
    
    for (int i = 1; i <= n; i++) {
        double term = Math.pow(x, i) / i; // compute ith term
        sum += term; // add ith term to sum
    }
    
    System.out.println("e^" + x + " = " + sum); // print final result
     
}
}
