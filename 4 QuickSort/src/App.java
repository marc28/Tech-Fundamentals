public class App {

	/**
	 * Constructor
	 */
	public App() {
		int[] array = {3,2,4,1,5};

		quickSort(array, 0, array.length - 1);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	/**
	 * Main Method
	 */
	public static void main(String[] args) {
		new App();

	}

	/**
	 * Quick Sort method
	 */
	void quickSort(int[] a, int l, int r) {
		if (l >= r)
			return;
		int k = partition(a, l, r);
		quickSort(a, l, k - 1);
		quickSort(a, k + 1, r);
		return;
	}

	/**
	 * Partition method
	 */
	private int partition(int[] a, int l, int r) {
		
		int i = l - 1;
		int j = r;
		int p = a[r];
		while (i < j) {
			do {
				i = i + 1;
			} while (i < j && a[i] < p);
			do {
				j = j - 1;
			} while (i < j && a[j] > p);

			if (i < j)
				swap(a, i, j);
		}
		swap(a, i, r);
		return i;
	}

	/**
	 * Swap method
	 */
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
