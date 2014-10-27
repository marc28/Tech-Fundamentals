public class Source {

	public Source() {
		int size = 800;
		int times = 80000;
		
		//GirdQuery
		long start = System.currentTimeMillis();
		int answer1 = gridQuery(20, 20, size);
		long end = System.currentTimeMillis();
		long totalTime = end - start;
		System.out.println("Slow ALorithm Time taken: " + (totalTime));

		//Fast Grid Query
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			int answer2 = fastGridQuery(20, 20);
		}
		long end2 = System.currentTimeMillis();
		long totalTime2 = end2 - start2;
		System.out.println("Slow ALorithm Time taken: " + (totalTime2));

		//XOR Grid Query
		long start3 = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			int answer3 = xorGridQuery(20, 20);
		}
		long end3 = System.currentTimeMillis();
		long totalTime3 = end3 - start3;
		System.out.println("Slow ALorithm Time taken: " + (totalTime3));

	}

	/**
	 * The slower grid method
	 */
	public int[][] grid(int n) {
		int[][] grid = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = getGridEntry(grid, n, i, j);
			}
		}

		return grid;
	}

	/**
	 * 
	 * Get Grid Entry Method
	 */
	private int getGridEntry(int[][] grid, int n, int r, int c) {

		int[] U = new int[n * 2];
		int x = 0;

		// crossing off the numbers from RIGHT -> LEFT
		for (int i = 0; i < c; i++) {
			x = grid[r][i];
			U[x] = 1;
		}

		// crossing off the numbers from TOP -> BOTTOM
		int y = 0;
		for (int j = 0; j < r; j++) {
			y = grid[j][c];
			U[y] = 1;
		}

		// running through the U array and putting in 1's
		for (int k = 0; k < n; k++) {
			if (U[k] == 0)
				return k;
		}

		return 0;
	}

	/**
	 * Grid Query Method
	 */
	private int gridQuery(int r, int c, int n) {
		int[][] grid = grid(n);

		return grid[r][c];
	}

	/**
	 * 
	 * Fast-Grid-Query Method
	 */
	private int fastGridQuery(int r, int c) {

		if (r < 2 && c < 2) {
			if (r == c)
				return 0;
			else
				return 1;
		}

		int p = largestPowerOfTwo(r);
		int q = largestPowerOfTwo(c);

		if (p == q)
			return fastGridQuery(r - power(2, p), c - power(2, q));
		else if (p > q)
			return power(2, p) + fastGridQuery(r - power(2, p), c);
		else
			return power(2, q) + fastGridQuery(r, c - power(2, q));

	}

	/**
	 * The XOR Algorithm
	 */
	private int xorGridQuery(int r, int c) {
		return (r ^ c);
	}

	/**
	 * The largest of two method
	 * 
	 */
	private int largestPowerOfTwo(int n) {

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			if (power(2, i) <= n)
				ans = i;
			if (power(2, i) > n) // no point in continuing on if its larger
				break;
		}
		return ans;
	}

	/**
	 * The power method
	 */
	private int power(int a, int b) {
		return (int) Math.pow(a, b);
	}

	/**
	 * Print method
	 */
	public void printGrid(int[][] grid) {
		// printing out the grid
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Main Method
	 */
	public static void main(String[] args) {
		new Source();

	}

}
