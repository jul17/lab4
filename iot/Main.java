package lab4.iot;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("Start Work.. \n");

		StringProcessor stringProcessor = new StringProcessor();
		String userText = stringProcessor.readInputText();
		stringProcessor.processText( userText);

		System.out.println("\nDone..");
	}

}
