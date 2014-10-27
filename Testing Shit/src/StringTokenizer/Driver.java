package StringTokenizer;

import java.util.StringTokenizer;

public class Driver {

	public Driver() {
		String sentence = "hello, how, are, you?";
		StringTokenizer st = new StringTokenizer(sentence, " ");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken().trim());
	}

	public static void main(String[] args) {
		new Driver();

	}

}
