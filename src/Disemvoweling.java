
import java.util.Scanner;

public class Disemvoweling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the disemvoweling utility.");
        System.out.println("Enter your phrase:");
        String original = scan.nextLine();
        original= original.toLowerCase();
        String newForm2 = vowelFind(original);
        String finalForm = doubleFind(newForm2);
        System.out.println("The disemvoweled phrase is: " + finalForm);
        double length1 = (double)(original.length());
        double length2 = (double)(finalForm.length());
        double lengthDif = length1-length2;
        double lengthPer1 = length2/length1;
        double lengthPer2 = 1- lengthPer1;
        double lengthPer3 = lengthPer2*1000;
        double lengthPer4 = (int)(lengthPer3+.5);
        double lengthPer5 = (double)(lengthPer4/10);
        System.out.println("Reduced from " + length1 + " to " + length2 + " characters. Reduction rate of " + lengthPer5 + "%");



    }

    public static String doubleFind(String original) {
        int length1 = original.length()-1;
        String newForm1 = "";
        for (int i=0; i< length1; i++) {
            String a = original.substring(i,i+1);
            String b = original.substring(i+1,i+2);

            if (!(a.equals(b))) {
                newForm1 += original.substring(i,i+1);

            }

            }
        newForm1 += original.substring(length1);
        return newForm1;
        }



    public static String vowelFind (String original) {
        int length1 = original.length();
        String newForm2 ="";
        String vowelA = "a";
        String vowelE = "e";
        String vowelI = "i";
        String vowelO = "o";
        String vowelU = "u";
        String vowelY = "y";
        for (int i=0; i< length1; i++) {
            if ((!(original.substring(i, i+1).equals(vowelA)) && !(original.substring(i, i+1).equals(vowelE)) && !(original.substring(i, i+1).equals(vowelI)) && !(original.substring(i, i+1).equals(vowelO)) && !(original.substring(i, i+1).equals(vowelU)) && !(original.substring(i, i+1).equals(vowelY)))){
                newForm2 += original.substring(i, i+1);
            }
            else {
                newForm2 += "";
            }


        }
        return newForm2;
    }
}
