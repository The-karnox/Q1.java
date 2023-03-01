import java.util.*;
public class Q12 {

    public static boolean isNiven(int n){
        int sum = 0;
        int temp = n;
        while(temp >0){
          int digit = temp%10;
          sum+= digit;
          temp/=10;
         }
         if(n%sum==0){
         return true;
         }else{
          return false;
         }

     }
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num");
      int n = sc.nextInt(); 
      System.out.println(isNiven(n));
     }
}
