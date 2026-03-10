/**
 * OOPSBannerApp UC8 - Advanced OOP Concepts Implementation
 *
 * <p>This class demonstrates advanced Object-Oriented Programming concepts through the
 * creation and display of an ASCII art banner. It extends the functionality of Use Case 7
 * by implementing a modular, reusable character pattern system using the Collections Framework.</p>
 *
 * @author Developer
 * @version 8.0
 */



import java.util.HashMap;

public class OOPSBannerApp {

   
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        });

        charMap.put('P', new String[] {
            "****** ",
            "**  ** ",
            "**  ** ",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        });

        charMap.put('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " *****",
            "    **",
            "    **",
            " *****"
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                String[] pattern = charMap.get(message.charAt(i));
                line.append(pattern[row]);
                if (i < message.length() - 1) {
                    line.append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

   
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}