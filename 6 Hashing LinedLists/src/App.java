
public class App {

	public App() {
		System.out.println(mySquareRoot(25));
		//System.out.println(0.9999999981373549 * 0.9999999981373549);
	}

	public static void main(String[] args) {
		new App();

	}
	
	private static boolean almostEqual(double x, double y)
	{
		final double TOLERANCE = 0.000000000000001;
		return Math.abs(x - y) < TOLERANCE; 		
	}
	/// TODO: Get this working!!!
	private static double mySquareRoot(double number)
	{
		double lower = 0, square = 0;
		double upper = number;
		double guess = (lower+number)/2;
		final int MAX_ITERATIONS = 1000000; // 1 million
		int i = 0;
		while(!almostEqual(square, number) && i < MAX_ITERATIONS)
		{			
			square = guess*guess;
			if(square < number) // Reminder: This means our guess was too small
			{
				lower = guess; 
			}
			else if(square > number) // This means our guess was too big
			{
				upper = guess;
			}
			guess = (lower+upper)/2;
			++i;
			System.out.println(i);
		}				
		/// OOOPS?
		return guess;
	}

}
