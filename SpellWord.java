import acm.program.ConsoleProgram;

public class SpellWord extends ConsoleProgram{
	
	private String text1;
	
	private String text2;
	
	
	
	public void run(){
		text1 = readLine("Enter text: "); 
		text2 = readLine("Enter text to see if we can spell it: "); 
		if(weCanSpell()){
			println("true");
		}else{
			println("false");
		}
	}
	
	private boolean weCanSpell(){
		for(int i = 0; i < text2.length(); i++){
			int m = text1.indexOf(text2.charAt(i));
			if(m == -1){
				return false;
			}else{
				text1= text1.substring(0,m) + text1.substring(m+1);
			}
		}
		return true;
	}
}
