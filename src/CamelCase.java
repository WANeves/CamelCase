import java.util.ArrayList;

/**
 * Created by wellingtonalvesdasneves on 6/12/16.
 */
public class CamelCase {
//    public String toLowerCase(String s) {
//        String result = "";
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            char currentCharToLowerCase = Character.toLowerCase(currentChar);
//            result = result + currentCharToLowerCase;
//        }
//        return result;
//    }
//
//    public String toUpperCase(String s) {
//        String result = "";
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            char currentCharToUpperCase = Character.toUpperCase(currentChar);
//            result = result + currentCharToUpperCase;
//        }
//        return result;
//    }
//
//    public String compoundName(String wellingtonAlves) {
//        return "";
//    }

//    public String toCamelCase(String s) {
//        String result = "";
//        boolean isDelim = false;
//
//        if (s.length() == 0) {
//            return result;
//        }
//
//        char firstChar = s.charAt(0);
//        char firstCharToUpperCase = Character.toUpperCase(firstChar);
//        result = result + firstCharToUpperCase;
//
//        for (int i = 1; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            char previousChar = s.charAt(i - 1);
//            boolean isUpperCase = false;
//
//            if ((i + 1) < s.length()) {
//                isUpperCase= Character.isUpperCase(s.charAt(i + 1));
//            }
//
//            if (previousChar == ' ' || isDelim) {
//                isDelim = false;
//                result = result + Character.toUpperCase(currentChar);
//            } else {
//                isDelim = isUpperCase;
//                result = result + Character.toLowerCase(currentChar) + ((isUpperCase == true) ? " " : "");
//            }
//        }
//        return result;
//    }

    public static ArrayList<String> toCamelCase(String s){
        ArrayList<String> result = new ArrayList<String>();
        String palavra = "";
        int countWords = s.length();

        boolean isDelim = false;

        if (countWords == 0) {
            return result;
        }

        char firstChar = s.charAt(0);
        palavra = String.valueOf(Character.toUpperCase(firstChar));

        for (int i = 1; i < countWords; i++) {
            char currentChar = s.charAt(i);
            char previousChar = s.charAt(i - 1);
            boolean isUpperCase = false;

            if ((i + 1) < countWords) {
                isUpperCase= Character.isUpperCase(s.charAt(i + 1));
            }

            if (previousChar == ' ' || isDelim) {
                isDelim = false;
                result.add(palavra);
                palavra = String.valueOf(Character.toUpperCase(currentChar));
            } else {
                isDelim = isUpperCase;
                palavra = palavra + Character.toLowerCase(currentChar);

                if (i == (countWords - 1)) {
                    result.add(palavra);
                }
            }
        }
        return result;
    }
}
