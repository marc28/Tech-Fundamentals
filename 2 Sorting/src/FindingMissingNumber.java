public class FindingMissingNumber {

	/**
	 * 
	 */
	public FindingMissingNumber() {
		int[] a = { 1,2,3,4,5,6,7,8,9};
		a = sortTheArray(a);
		// System.out.println(findNumber(a));
		findDuplicateOccurence(a);
		System.out.println(binarySearch(a, 2));

	}

	/**
	 * 
	 * @param ray
	 * @return
	 */
	int findNumber(int[] ray) {
		for (int i = 0; i < ray.length-1; i++) {
			if (ray[i + 1] - ray[i] == 2)
				return ray[i] + 1;
		}

		return -1;
	}

	/**
	 * 
	 * @param a
	 */
	void findDuplicateOccurence(int[] a) {

		int test = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] == test){
				System.out.print(a[i] + " ");
			}
			test = a[i];
		}
	}
	
	/**
	 * Binary Search
	 */
	int binarySearch(int a[], int key){
		int high = a.length-1;
		int low = 0;
		
		while(low<=high){
			int mid = (low + high)/2;
			
			if(a[mid] == key){
				return mid;
			}else if(a[mid] < key){
				low = mid;
			}else{
				high = mid;
			}
				
		}
		return -1;
	}
	

	/**
	 * 
	 * @param array
	 * @return
	 */
	int[] sortTheArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindingMissingNumber();
	}

}
