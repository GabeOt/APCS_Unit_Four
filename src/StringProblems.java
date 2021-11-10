public class StringProblems {

    public static String addHyphens(String s) {
        String newString = "";
        for (int i=0; i<s.length(); i++) {
            newString += s.substring(i, i+1) + "-";
        }
        return newString.substring(0, newString.length()-1);

    }

    public static String everyOtherLetter(String s) {
        String newString = "";
        for (int i=0; i<s.length(); i+=2) {
            newString += s.substring(i, i+1);
        }
        return newString;

    }


    public static String differentStrings(String s1, String s2) {
        int dif = 0;
        if ((s1.length() == s2.length()) && (s1.compareTo(s2) == 0)) {
                return s1 + " and " + s2 + " are the same";
            }

        else if (s1.length() > s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (!s1.substring(i, i+1).equals(s2.substring(i,i+1))){
                    return s1 + " and " + s2 + " are not the same. They differ at letter number " + i;
                }

            }
        }
        else if (s1.length() < s2.length()) {
            for (int i = 0; i < s2.length(); i++) {
                if (!s1.substring(i, i + 1).equals(s2.substring(i, i + 1))) {
                    return s1 + " and " + s2 + " are not the same. They differ at letter number " + i;
                }


            }
        }
        else if (s1.length() == s2.length()) {
            for (int i=0; i <s1.length(); i++) {
                if (s1.substring(i, i+1) != s2.substring(i,i+1)) {
                    return s1 + " and " + s2 + " are not the same. They differ at letter number " + i;
                }
            }
        }
        return "";
    }



    public static boolean isPalindrome(String word) {
        return true;
    }
}
