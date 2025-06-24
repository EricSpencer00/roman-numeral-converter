import java.util.Scanner;
import romanToNumeral.romanToNumeral;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        romanToNumeral converter = new romanToNumeral();

        for (String line; scanner.hasNextLine(); ) {
            line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break; // Exit on empty line
            }
            try {
                int result = converter.romanToInt(line);
                System.out.println("The integer value is: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Roman numeral: " + line);
            }
        }
    }
}
