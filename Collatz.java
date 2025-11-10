// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean verbose = mode.equals("v");
		
		for ( int i = 1; i <= N; i++){
			int steps = 1;
			int currentValue = i;
			while (currentValue != 1 || steps == 1) {
				if (verbose) System.out.print(currentValue + " ");	
				if (currentValue % 2 == 0) {
					currentValue /= 2;
				} else {
					currentValue = currentValue * 3 + 1;
				}
				steps ++;
			}
			if (verbose) System.out.print(currentValue);	
			if (verbose) System.out.println(" (" + steps + ")");	
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");


	}
}
