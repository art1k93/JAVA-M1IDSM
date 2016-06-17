package ua.khnue.Sheiko10.subtask04;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subtask04 {

	public static void main(String[] args) throws IOException {
		// не лушее решение, будут найдены слова-палиндромы, которые состоят из не более чем 5ти групп
		Pattern pattern = Pattern.compile("\\b(.?[^\\s])(.?)(.?)(.?)(.?).?\\5\\4\\3\\2\\1\\b");
		Matcher matcher = pattern.matcher("radar eye eagle Ease deleveled rotator level");
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
