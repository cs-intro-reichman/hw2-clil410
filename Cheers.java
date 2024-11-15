// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args [0];
            int N = Integer.parseInt(args [1]);
            String a = "";
            for (int i=0; i <= word.length() - 1; i++) {
                boolean isFound = "AEFHILMNORSX".indexOf(Character.toUpperCase(word.charAt(i)) != -1;
                if (isFound == true) {
                        a = "an";
                } else {
                        a = "a";
                }
                System.out.println("Give me " + a + " " + word.charAt(i) + ": " + word.charAt(i) + "!" );
            } 
            System.out.println("What does that spell?");
            for (int i=0; i < N; i++) {
                System.out.println(word + "!!!");
            }
        }
}

