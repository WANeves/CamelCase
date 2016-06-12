/**
 * Created by wellingtonalvesdasneves on 6/12/16.
 */
public class CamelCase {
    public String toLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char currentCharToLowerCase = Character.toLowerCase(currentChar);
            result = result + currentCharToLowerCase;
        }
        return result;
    }

    public String toUpperCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char currentCharToUpperCase = Character.toUpperCase(currentChar);
            result = result + currentCharToUpperCase;
        }
        return result;
    }
}
