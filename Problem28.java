import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram{
	private static final int q = -1;
	
	public void run() {
		int a = readInt("Enter integer: ");
		int count = 0;
		while(a != q){
			if(a % 2 == 0) {
				count +=1;
			}
		}
	}
}
