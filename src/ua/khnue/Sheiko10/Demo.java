package ua.khnue.Sheiko10;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import ua.khnue.Sheiko10.subtask01.Subtask01;
import ua.khnue.Sheiko10.subtask02.Subtask02;
import ua.khnue.Sheiko10.subtask03.Subtask03;
import ua.khnue.Sheiko10.subtask04.Subtask04;
import ua.khnue.Sheiko10.subtask05.Subtask05;

public class Demo {
	private static final InputStream STD_IN = System.in;
	private static final String ENCODING = "Cp1251";
	
	public static void main(String[] args) throws IOException {
		System.out.println("Subtask01");
		System.out.println("Looking for words with same first and last letter. See what I found: ");
		System.setIn(new ByteArrayInputStream("Text to input".getBytes(ENCODING)));
		Subtask01.main(args);
		
		/*System.out.println("Subtask02");
		System.setIn(new ByteArrayInputStream("Text to input".getBytes(ENCODING)));
		Subtask02.main(args);*/
		
		/*System.out.println("Subtask03");
		System.setIn(new ByteArrayInputStream("Text to input".getBytes(ENCODING)));
		Subtask03.main(args);*/
		
		System.out.println("Subtask04");
		System.out.println("Looking for palindromes. See what I found: ");
		System.setIn(new ByteArrayInputStream("Text to input".getBytes(ENCODING)));
		Subtask04.main(args);
		
		/*System.out.println("Subtask05");
		System.setIn(new ByteArrayInputStream("Text to input".getBytes(ENCODING)));
		Subtask05.main(args);*/
		
		// Restore the standard input.
		System.setIn(STD_IN);
	}
}
