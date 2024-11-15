// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
		int N = Integer.parseInt(args[0]);
		int i=0; 
		int sumLessThen = 0;
		int sumGreatThen = 0;
		while (i < N) {
			double res = Math.random();
			if (res <= 0.5) {
				sumLessThen++;
			} else {
				sumGreatThen++;
			}
			i++;
		}
		int min = Math.min(sumGreatThen, sumLessThen);
		int max = Math.max(sumGreatThen, sumLessThen);
		double ratio = (double) min / max;
		System.out.println("> 0.5: " + sumGreatThen + "times");
		System.out.println("<= 0.5: " + sumLessThen + "times");
		if (min != 0 && max != 0){
			System.out.println("Ratio: " + ratio);
		}
	}
}
