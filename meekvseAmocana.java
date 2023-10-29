import acm.program.ConsoleProgram;

public class meekvseAmocana extends ConsoleProgram{
	
	public void run() {
		int n = readInt("Enter integer: ");
		while(true){
			if(n % 2 ==0){
				n = n / 2;
			}else{
				n = 3 * n + 1;
			}
			if(n == 1){
				println(n);
			}
		}
	}
}
