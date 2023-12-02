import acm.program.ConsoleProgram;

public class Manipulate extends ConsoleProgram{

	public void run(){
		String mainText = readLine("Enter String");
		String text2= readLine("");
		if(canManipulate(mainText, text2)){
			println("true");
		}
	}

	private boolean canManipulate(String mainText, String text2) {
		for(int i = 0; i < text2.length(); i++){
			mainText  text2.charAt(i);
			
		}
	}
	
}
