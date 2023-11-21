import acm.program.ConsoleProgram;
//დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ სიმბოლოს.
public class Problem46 extends ConsoleProgram{
	
	public void run(){
		String word = readLine("Enter word: ");
		boolean palindrom = isPalindrom(word);
			if(palindrom){
				println(word + " is palindrom.");
			} else {
				println(word + " is not palindrom.");
			}
		}

	private boolean isPalindrom(String word) {
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i)!= word.charAt(word.length() - i)){
				return false;
			}
		}
		return true;
	}
}
