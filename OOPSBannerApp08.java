import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp08 {

    // Centralized map for character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Define ASCII art patterns for characters
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to render banner for a word
    public static void renderBanner(String word) {
        StringBuilder[] lines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            lines[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {
            String[] pattern = patternMap.get(c);
            if (pattern != null) {
                for (int i = 0; i < 5; i++) {
                    lines[i].append(pattern[i]).append("  ");
                }
            }
        }

        // Print assembled banner
        for (StringBuilder line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}