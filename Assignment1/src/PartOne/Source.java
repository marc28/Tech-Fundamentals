package PartOne;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Source {

	// Class variables
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	PrintWriter pw;

	// Constructor
	public Source() {

		System.out.println("Please enter the name of your text file");
		String input = scan.next() + ".txt";
		String returnedDoc = readTextFile(input);

		System.out.println("Please enter the name of the ouptu file");
		String output = scan.next() + ".txt";

		try {
			pw = new PrintWriter(new FileWriter(output, true));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String[] x = returnedDoc.split("(^[a-zA-z])");

		for (int i = 0; i < x.length; i++) {
			String[] change = x[i].split("(?!^)");
			randomiseWord(change, change.length);
			for (int j = 0; j < change.length; j++) {
				pw.append(change[j]);
			}
			pw.append(" ");
		}

		pw.close();
		System.out.println("Success");
	}

	/**
	 * Method to read a text file
	 */
	String readTextFile(String name) {
		String doc = "";
		try {
			Scanner scan2 = new Scanner(new FileReader(name));
			while (scan2.hasNextLine()) {
				doc += scan2.nextLine() + "\n";
			}
			scan2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return doc;
	}

	/**
	 * Method to randomise a word : Working
	 */
	void randomiseWord(String[] word, int n) {
		for (int i = 1; i < n - 1; i++) {
			int num = rand.nextInt(n - 2) + 1;
			swap(word, i, num);
		}

	}

	/**
	 * Swap method : Working
	 */
	private void swap(String[] a, int i, int num) {
		String temp = a[i];
		a[i] = a[num];
		a[num] = temp;

	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Source();

	}

}
