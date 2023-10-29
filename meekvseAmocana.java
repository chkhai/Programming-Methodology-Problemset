import acm.program.ConsoleProgram;

public class meekvseAmocana extends ConsoleProgram{
	
	public void run() {
		int n = readInt("Enter integer: ");
		while(true){
			if(n % 2 ==0){
				println(n + " is even so I take half: " + n / 2);
				n = n / 2;
			}else{
				println(n + " is odd, so I make 3n+1:" + 3 * n +1);
				n = 3 * n + 1;
			}
			if(n == 1){
				break;
			}
		}
		print("we got 1");
	}
}
