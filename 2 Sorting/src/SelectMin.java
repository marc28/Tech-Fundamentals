
public class SelectMin {

	public SelectMin() {
		
		/*int [] ray = {5,3,2,4,1};
		int k = 1;*/
		
		System.out.println(fibonacci(4));
	}

	
	public int selectMinVal(int []a , int k , int n){
		int m = k;
		
		for(int i = k+1; i < n; i++){
			for(int j = k+1 ; j < n ; j++){
				if(a[i] < a[j]){
					m = i;
				}
			}
		}
		
		return m;
	}
	
	public int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectMin();
	}

}
