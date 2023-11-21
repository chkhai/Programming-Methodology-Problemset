import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram{
	public void run(){
		String str = "3456";
		int num = stringToInteger(str);
		println(num);
	}

	private int stringToInteger(String str) {
		for(int i = 0; i < str.length(); i++){
			char currCh = str.charAt(i);
			int currDigit = currCh - '0';
			return currDigit;
		}
		return 0;
	}
}
