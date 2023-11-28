import acm.program.ConsoleProgram;

public class Alphabet extends ConsoleProgram{

	private String str;
	
	private String alphabet;
	
	public void run() {
		str = readLine("Enter string: ");
		alphabet = "abcdefghijklmnopqrstuvwxyz";
		if(canSpell()){
			println("true");
		}else{
			println("false");
		}
	}

	private boolean canSpell() {
		for(int i =0; i<str.length(); i++){
			char ch = str.charAt(i);
			int m = alphabet.indexOf(ch);
			if(m != -1){
//				alphabet = alphabet.substring(0, m) + alphabet.substring(m + 1);
				return true;
			}else{
				return false;
			}
		}
		return true;
	}
}
