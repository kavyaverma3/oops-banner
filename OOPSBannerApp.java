/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 *
 * @author Developer
 * @version 6.0
 */



public class OOPSBannerApp {

    
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        };
    }

    
    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "**  ** ",
            "**  ** ",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        };
    }


    public static String[] getSPattern() {
        return new String[] {
            " *****",
            "**    ",
            "**    ",
            " *****",
            "    **",
            "    **",
            " *****"
        };
    }

    
    public static void main(String[] args) {

        
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}