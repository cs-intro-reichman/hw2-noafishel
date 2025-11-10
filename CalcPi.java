// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double divisor = 1;
		double sum = 0;
		int i = 0;
		while (i < num) {
			divisor = (i % 2 == 0 ? 1 : -1) * (1 + 2 * i); 
			sum += 1 / divisor;
			i++;
		}
		double pi = sum * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);
	}
}
