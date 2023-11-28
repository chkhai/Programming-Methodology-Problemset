import acm.program.ConsoleProgram;

public class Alphabet extends ConsoleProgram{

	private String str;
	
	
	public void run() {
		str = readLine("Enter string: ");
		if(canSpell()){
			println("true");
		}else{
			println("false");
		}
	}

	private boolean canSpell() {
		for(int i =0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(!Character.isLetter(ch)){
				return false;
			}
			
		}
		return true;
	}
}	
