package PartOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOneSentenceTest {
	TestOneSentence a = new TestOneSentence();

	@Test
	public void testFindStart() {
		String [] word = {"\"","I","n","d","e","e","d"};
		assertEquals(1, a.findStart(word));
	}
	
/*	@Test
	public void testFindEnd() {
		String [] word = {"e","b","o","o","k",","};
		System.out.println(a.findLast(word));
		assertEquals(4, a.findLast(word));
	}*/

}
