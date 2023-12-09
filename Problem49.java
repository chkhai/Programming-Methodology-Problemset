import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram{
	public void run(){
		String str = "3456";
		int num = stringToInteger(str);
		println(num);
	}

	private int stringToInteger(String str) {
		int k = 0;
		for(int i = 0; i < str.length(); i++){
			char currCh = str.charAt(i);
			int currDigit = currCh - '0';
			k = k * 10 + currDigit;
		}
		return k;
	
	}
}
