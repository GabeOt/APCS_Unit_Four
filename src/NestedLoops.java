public class NestedLoops {

    public static String xSquare(int n) {
        String fin = "";
        for (int i=1; i<= n; i++) {
            for (int j=1; j<=n; j++) {
               fin +="X";
            }
            fin +="\n";
        }

        return fin;
    }

    public static String flippedTriangle(int n) {
        String fin = "";
        for (int i=n; i>=0; i-- ) {
            for (int j=0; j<i; j++) {
                fin += "*";
            }
            fin += "\n";
        }
        return fin;


    }

    public static String fizzBuzz(int n) {
        String fin = "";
        for (int i =1; i<=n; i++) {
            for (int j = i; j<=i; j++) {
                if ((i%3==0)&&(i%5!=0)) {
                    fin += "Fizz ";
                }
                else if (i%20==0) {
                    fin += "Buzz" + "\n";
                }
                else if ((i%5==0)&&(i%3!=0)) {
                    fin += "Buzz ";
                }
                else if ((i%3==0)&&(i%5==0)) {
                    fin += "Fizz Buzz ";
                }
                else {
                    fin += i + " ";
                }

            }
        }

        return fin;
    }
}
