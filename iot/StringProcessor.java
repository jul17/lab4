package lab4.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.*;

public class StringProcessor {

	private final String regexp = "\\BMNF\\_.*?\\_([0-9]{1,3})|MNF\\_.*?\\_([0-9]{1,3})";
	private int count = 0;

	public String readInputText() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter string..\n");
		return br.readLine();
	}

	public void processText(final String data) {

		Pattern pattern = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(data);

		System.out.println("User text is:" +  "\n");
		System.out.println("Text before formatting:\n" + data + "\n RESULT:\n");

		while (matcher.find()) {
			count++;
			showResults(count, matcher.group());
		}
	}

	public void showResults(int count, String result) {
		System.out.println("Result-" + count + ": " + result + " \nis MAN_" + count);

	}

}