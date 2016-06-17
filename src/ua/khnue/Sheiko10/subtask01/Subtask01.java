package ua.khnue.Sheiko10.subtask01;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subtask01 {

	public static void main(String[] args) throws IOException {
		
		Pattern pattern = Pattern.compile("\\b(\\w)\\w+\\1\\b");
		Matcher matcher = pattern.matcher("shelves eye eagle ease deleveled rotator level");
		boolean found = false;
		
		while (matcher.find()) {
			System.out.format("- \"%s\" starting at index %d and ending at index %d.%n", matcher.group(),
					matcher.start(), matcher.end());
			found = true;
		}
		
		if(!found) {
			System.out.format("hm... unfortunately no match found :(%n");
		}
	}
}
