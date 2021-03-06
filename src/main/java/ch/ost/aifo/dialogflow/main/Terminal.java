package ch.ost.aifo.dialogflow.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ch.ost.aifo.dialogflow.dialogflow.CustomRequestBuilder;

public class Terminal {
	public static void main(String[] args) throws Exception {
		String projectId = "todolist-wsvc";
		String sessionId = "abcde";
		String languageCode = "en-US";
		
		CustomRequestBuilder requestBuilder = new CustomRequestBuilder(projectId, sessionId, languageCode);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Hello, please enter a line for the client and confirm with enter. (Press q for quit.)");
			String line = "";
			while (true) {
				line = br.readLine().strip();
				if (line.equals("")) { //skip empty lines
					continue;
				}
				if (line.equals("q")) { // quit the application
					break;
				}
				requestBuilder.detectIntentTexts(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
