
public class Source {

	public Source() {
		int num = 42,loopnum = 1;
		for (int i = 3; i < num; i++) {
			System.out.println("Loop number: " + (loopnum));
			long start = System.currentTimeMillis();
			loopFib(i);
			long end = System.currentTimeMillis();
			long totalTime = end - start;
			System.out.println("My Foor Loop: " + (totalTime));
			
			long start2 = System.currentTimeMillis();
			fibRecursion(i);
			long end2 = System.currentTimeMillis();
			long totalTime2 = end2 - start2;
			System.out.println("Recursive Loop: " + (totalTime2));
			System.out.println();
			loopnum++;
		}
		
		
		
		//System.out.println(fibRecursion(num));
	}

	public static void main(String[] args) {
		new Source();

	}

	int loopFib(int n){
		
		int x = 1, y=1, total = 0, temp = 0;
		
		for(int i=2;i<n;i++){
			total= x+y;
			temp = x;
			x=total;
			y = temp;
		}
		return total;
	}

	int fibRecursion(int n){
		if(n==1 || n==2)
			return 1;
		return fibRecursion(n -1) + fibRecursion(n-2);
	}

}
