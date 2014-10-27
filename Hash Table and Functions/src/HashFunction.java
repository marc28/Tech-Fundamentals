import java.util.Arrays;

public class HashFunction {
	String[] theArray;
	int arraySize; // arraysize will be monitored
	int itemsInArray = 0; // will be updated as things are entered into the
							// array.

	public static void main(String[] args) {
		HashFunction thefunc = new HashFunction(30);
		String[] elementsToAdd = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" }; // 30 items therefor
															// defo a collision
		/*
		 * thefunc.hashFunction1(elementsToAdd, thefunc.theArray);
		 * thefunc.display();
		 */
		thefunc.hashFunction2(elementsToAdd, thefunc.theArray);
		thefunc.findKey("660");
		thefunc.display();
	}

	public HashFunction(int size) {
		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1"); // filling the array with -1 to show they
										// are empty
	}

	// Here is a bad hash function: put values in the same index that match
	// their value:
	// eg value 1 will be stored in index 1;
	public void hashFunction1(String[] stringsForArray, String[] theArray) {
		for (int i = 0; i < stringsForArray.length; i++) {
			String newElement = stringsForArray[i];
			theArray[Integer.parseInt(newElement)] = newElement;
		}
	}

	/**
	 * What if we have to hold values between 0 -999 into a 30 item array?? use
	 * mod to shrink the size instead of an array size 999
	 */
	public void hashFunction2(String[] stringsForArray, String[] theArray) {
		for (int i = 0; i < stringsForArray.length; i++) {
			String newElement = stringsForArray[i];
			int arrayIndex = Integer.parseInt(newElement) % 29; // the size of
																// the array
			System.out.println("Modulus index: " + arrayIndex + " for value: "
					+ newElement);
			while (theArray[arrayIndex] != "-1") {
				++arrayIndex;
				System.out.println("Collision try at " + arrayIndex
						+ " instead");
				arrayIndex %= arraySize;
			}
			theArray[arrayIndex] = newElement;
		}
	}

	/**
	 * find values in the hash table
	 */
	public String findKey(String key) {
		
		int arrayIndex = Integer.parseInt(key) % 29;
		while(theArray[arrayIndex] != "-1"){
			if(theArray[arrayIndex] == key){
				System.out.println("The key: " + key + " has been found at " + arrayIndex);
				return theArray[arrayIndex];
			}
			++arrayIndex;
			arrayIndex%= arraySize; //if we get to the end need to go back to the end
		}

		return null;

	}

	/**
	 * 
	 */
	private void display() {
		for (int i = 0; i < arraySize; i++) {
			System.out.format(" %3s ", i);
		}
		System.out.println();
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i].equals("-1"))
				System.out.format(" %3s ", " ");
			else
				System.out.format(" %3s ", theArray[i]);
		}
	}

}
