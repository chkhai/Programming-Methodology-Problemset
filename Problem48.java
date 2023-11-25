import acm.program.ConsoleProgram;
//კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო
//რამდენჯერ გვხვდება
public class Problem48 extends ConsoleProgram{
	
	public void run() {
		String input = readLine("Enter a word: ");
		keepTheTrackOfSymbols(input);
	}

	private void keepTheTrackOfSymbols(String input) {
		for(int i = 0; i < input.length() - 1; i++){
			char chc = input.charAt(i);
			for(int j = 0; j < input.length() - 1; j++){
				char ch = input.charAt(j);
				int count = 0;
				if(ch==chc){
					count++;
					println(ch " is " + count + " times");
				}
			}
		}
		
	}
}

