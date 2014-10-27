package ComputeHashValue;

public class Driver {

	public Driver() {
		System.out.println(computeHash("marcsq", 7));
		System.out.println(computeHash("marctq", 7));
	}

	public static void main(String[] args) {
		new Driver();

	}
	
	 int computeHash(String s, int tableSize){
		 
		 int total = 0;
		 for(int i= 0 ;i<s.length();i++){
			 total = 31*total + s.charAt(i);
		 }
		 return total % tableSize;
	 }

}
