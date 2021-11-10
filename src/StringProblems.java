public class StringProblems {

    public static String addHyphens(String s)
        {String newString = "";
        for (int i=0; 1<s.length(); i++) {
            newString += s.substring(i, i+1) + "-";
        }
        return newString.substring(0, newString.length()-1);

    }

    public static String everyOtherLetter(String s) {

        return "";
    }


    public static String differentStrings(String s1, String s2) {

        return "";
    }

    public static boolean isPalindrome(String word) {
        return true;
    }
}
