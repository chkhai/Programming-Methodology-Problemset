import acm.program.ConsoleProgram;
//კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო
//რამდენჯერ გვხვდება
public class Problem48 extends ConsoleProgram{
	
	public void run() {
		String input = readLine("Enter a word: ");
		keepTheTrackOfSymbols(input);
	}

	private void keepTheTrackOfSymbols(String input) {
		for(int i = 0; i < input.length(); i++) {
			char currCh = input.charAt(i);
			if(charWasInSentence(currCh)){
				
			}
		}
		
	}
}
