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
			int m = text1.indexOf(i);
			if(m != -1){
				text1= text1.substring(0,i) + text1.substring(i);
			}
		}
		if(text1.length()>0){
			return true;
		}
		return false;
	}
	
}
