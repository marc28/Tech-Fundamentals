package FromNotes;

public class Source {

	public Source() {
		int[] array = { 2, 5, 4, 1, 3 };
		selectionSort(array, array.length);
		printArray(array);

	}

	public static void main(String[] args) {
		new Source();

	}

	//=======
	int selectMin(int a[], int k, int n) {

		int m = k;
		for (int i = k; i < n; i++) {
			if (a[i] < a[m])
				m = i;
		}
		return m;
	}
	//=======
	void selectionSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int m = selectMin(a, i, n);
			swap(a, i, m);
		}
	}

	//======
	private void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}

	//=======
	void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
