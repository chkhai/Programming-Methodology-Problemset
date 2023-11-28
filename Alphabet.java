import acm.program.ConsoleProgram;

public class Alphabet extends ConsoleProgram{

	public void run() {
		String str = readLine("Enter string: ");
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		if(canSpell(str, alphabet)){
			println("true");
		}else{
			println("false");
		}
	}

	private boolean canSpell(String str, String alphabet) {
		for(int i =0; i<str.length(); i++){
			char ch = str.charAt(i);
			int m = str.indexOf(ch);
			if(m != -1){
				str = str.substring(0, m) + str.substring(m + 1);
			}else{
				return false;
			}
		}
		return true;
	}
}
