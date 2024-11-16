// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args [0];
            int N = Integer.parseInt(args [1]);
            for (int i=0; i <= word.length() - 1; i++) {
                boolean isFound = "AEFHILMNORSX".indexOf(word.charAt(i)) != -1;
                if (isFound == false) {
                        isFound = "aefhilmnorsx".indexOf(word.charAt(i)) != -1;
                }
                if (isFound == true) {
                        System.out.println("Give me an: " + Character.toUpperCase(word.charAt(i)) + ": " +Character.toUpperCase(word.charAt(i)) + "!" );
                } else {
                        System.out.println("Give me a:  " + Character.toUpperCase(word.charAt(i)) + ": " +Character.toUpperCase(word.charAt(i)) + "!" );
                }
                System.out.println("Give me " + a + " " + Character.toUpperCase(word.charAt(i)) + ": " +Character.toUpperCase(word.charAt(i)) + "!" );
            } 
            System.out.println("What does that spell?");
            for (int i=0; i < N; i++) {
                System.out.println(word.toUpperCase() + "!!!");
            }
        }
}
