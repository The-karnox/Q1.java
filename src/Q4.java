import java.util.Scanner;

public class Q4 {
   

    public static boolean checkTechNumber(int num) {
        String numStr = Integer.toString(num);
        int len = numStr.length();
        if (len % 2 != 0) {
            return false;
        }
        int halfLen = len / 2;
        int firstHalf = Integer.parseInt(numStr.substring(0, halfLen));
        int secondHalf = Integer.parseInt(numStr.substring(halfLen));
        int sum = firstHalf + secondHalf;
        int squareOfSum = sum * sum;
        return squareOfSum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number with an even number of digits: ");
        int num = sc.nextInt();
        boolean isTechNumber = checkTechNumber(num);
        if (isTechNumber) {
            System.out.println(num + " is a tech number.");
        } else {
            System.out.println(num + " is not a tech number.");
        }
    }
}
