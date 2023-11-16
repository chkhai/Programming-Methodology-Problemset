import acm.program.ConsoleProgram;
//მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო
public class Problem45 extends ConsoleProgram{
	public void run() {
		String word = readLine("Enter word: ");
		String symb = readLine("Enter symbol: ");
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i)==symb.charAt(1)){
				count++;
			}
		}
		println(count);
	}
}
