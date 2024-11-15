// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seedN = Integer.parseInt(args[0]);
		String mode = args [1];
		int seed;
		if (mode.charAt(0) == 'v'){
			for (int i = 0; i < seedN; i++) {
				seed = i + 1; 
				int count = 1;
				System.out.print(seed + " ");
				if (seed == 1) {
					seed = seed * 3 + 1;
					System.out.print(seed + " ");
					count++;
				}
				while (seed != 1) {
					if (seed % 2 == 0) {
					seed = seed / 2;
					} else {
						seed = seed * 3 + 1;
					}
				count++;
				System.out.print(seed + " ");
				if (seed == 1) {
					System.out.print("(" + count + ")");
					break;
					}
				}
				System.out.println();
			}
			System.out.println("Every one of the first " + seedN + " hailstone sequences reached 1.");
		}
		if (mode.charAt(0) == 'c') {
			boolean isOne = false;
			for (int i = 0; i < seedN; i++) {
				seed = i + 1; 
				if (seed == 1) {
					seed = seed * 3 + 1;
				}
				while (seed != 1) {
					if (seed % 2 == 0) {
					seed = seed / 2;
					} else {
						seed = seed * 3 + 1;
					}
				if (seed == 1) {
					isOne = true;
					break;
					}
				}
			}
			if (isOne) {
				System.out.println("Every one of the first " + seedN + " hailstone sequences reached 1.");
			}
		}
	}
}

		
		


