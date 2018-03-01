<<<<<<< HEAD
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

=======
package lab4.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.*;

public class StringProcessor {

	private final String regexp = "\\BMNF\\_.*?\\_([0-9]{1,3})|MNF\\_.*?\\_([0-9]{1,3})";// [\\[A-Z].*?\\!]\\s{1,5}
	private int count = 0;

	public String readInputText() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter string..\n");
		return br.readLine();
	}

	public void processText(final String userString) {

		String data = "MNF_" + userString + "_999 I is a 1999 flight! simulator video game developed by\n" + " MNF_"
				+ userString + "_001 and published by MNF_" + userString + "_111. It allows\n"
				+ " players to pilot reproductions of real-world commercial and civilian aircraft in and\n"
				+ " Around Seattle in the US state of Washington.\n";

		Pattern pattern = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(data);

		System.out.println("User text is:" + userString + "\n");
		System.out.println("Text before formatting:\n" + data + "\n RESULT:\n");

		while (matcher.find()) {
			count++;
			showResults(count, matcher.group());
		}
	}

	public void showResults(int count, String result) {
		System.out.println("Result-" + count + ": " + result + " \nis MAN_" + count);

	}

>>>>>>> c647738e7d2951e7b1eb43538850ab9691db0814
}