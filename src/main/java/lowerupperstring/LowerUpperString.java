package lowerupperstring;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class LowerUpperString {

    public String change(String str) {
        String returnStr = "";
        for (char theChar : str.toCharArray()) {
            // Get ASCII code of char
            int codeChar = (int) theChar;
            if (64<=codeChar && codeChar<=90) {
                codeChar = codeChar+32;
            } else if(97<=codeChar && codeChar<=122) {
                codeChar = codeChar-32;
            }
            // Get char for ASCII code
            char newChar = (char) codeChar;
            returnStr = returnStr + newChar;
        }
        return returnStr;
    }
}
