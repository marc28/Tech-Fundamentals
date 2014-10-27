import java.util.Random;


public class App {


	private int r = 3;
	private final int NUMTHROWS = 20;
	Random ran = new Random();
	
	public App() {

		double point = (int)(Math.PI)*(r*r);
		double inside = 0.0;
		
		for(int i = 0 ;i< NUMTHROWS;i++){
			double lands = ran.nextDouble();
			if(lands <= point)
				inside++;
		
		}
		
		System.out.println(4*inside/NUMTHROWS);
		
	}

	public static void main(String[] args) {
		new App();

	}

}
