package com.rcs.classwork.Day16Classes;

public class StringUtils {

    public static String getMiddle(String text) {
        int beginIndex;
        int endIndex;
        // text.length() odd or even ?
        if (text.length() % 2 == 0) {
            beginIndex = text.length() / 2 - 1;
            endIndex = beginIndex + 2;
        } else {
            beginIndex = text.length() / 2;
            endIndex = beginIndex + 1;
        }

        return text.substring(beginIndex, endIndex);
    }

    public static String getReverse(String text) {
        String newText = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            // newText += text.substring(i, i + 1);
            newText += text.charAt(i);
        }
        return newText;
    }

    public static boolean isPalindrome(String text) {
        // Vai text lasās tāpat kā getReverse(text)
        return text.equalsIgnoreCase(getReverse(text));

/*      if (text.equalsIgnoreCase(getReverse(text))) {
            return true;
        } else {
            return false;
        }*/
    }
}
