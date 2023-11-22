import acm.program.ConsoleProgram;
//კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო
//რამდენჯერ გვხვდება
public class Problem48 extends ConsoleProgram{
	
	public void run() {
		String input = readLine("Enter a word: ");
		for(int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			println(ch);
		}
	}
}
