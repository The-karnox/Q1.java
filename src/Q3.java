import java.util.*;

public class Q3 {
    

    public static String encodePigLatin(String word) {
        String vowels = "AEIOU";
        int firstVowelIndex = -1;
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                firstVowelIndex = i;
                break;
            }
        }
        if (firstVowelIndex == -1) {
            return word;
        } else {
            String consonants = word.substring(0, firstVowelIndex);
            String remainingLetters = word.substring(firstVowelIndex);
            return remainingLetters + consonants + "AY";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next().toUpperCase();
        String piglatin = encodePigLatin(word);
        System.out.println("Piglatin: " + piglatin);
    }
}
