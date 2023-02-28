import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int[] notes = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounts = new int[notes.length];
        for (int i = 0; i < notes.length; i++) {
            noteCounts[i] = amount / notes[i];
            amount = amount % notes[i];
        }
        System.out.println("Minimum number of notes required:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounts[i] > 0) {
                System.out.println(notes[i] + " - " + noteCounts[i]);
            }
        }
    }
}
