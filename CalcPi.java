// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numTerms = Integer.parseInt(args[0]);
		double sum = 1;
		double a = 1;
		double b;
		for (int i=0; i < numTerms - 1; i++) {
			a = a + 2;
			b = 1 / a;
			if (i % 2 == 0) {
				sum = sum - b;
			}
			else {
				sum = sum + b;
			}
		}
		double piSum = sum * 4;
		System.out.print("pi according to Java: " + Math.PI + "\n" +
               			 "pi, approximated: " + piSum + "\n");
	}
}

