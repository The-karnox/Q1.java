import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        // Initialize the two arrays with the seven wonders and their locations
        String[] wonders = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String[] locations = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};

        // Ask the user for a country name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Country Name: ");
        String country = scanner.nextLine();

        // Search for the country in the locations array
        int index = -1;
        for (int i = 0; i < locations.length; i++) {
            if (locations[i].equalsIgnoreCase(country)) {
                index = i;
                break;
            }
        }

        // If the country is found, display its wonder, otherwise display "Sorry Not Found!"
        if (index >= 0) {
            System.out.println(country + "-" + wonders[index]);
        } else {
            System.out.println("Sorry Not Found!");
        }
    }
}
