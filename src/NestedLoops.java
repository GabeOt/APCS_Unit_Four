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

        return "";
    }
}
