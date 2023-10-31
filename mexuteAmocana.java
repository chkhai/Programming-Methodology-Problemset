import acm.program.ConsoleProgram;
//not finished
public class mexuteAmocana extends ConsoleProgram{
	private static final int SENTINEL = 0;
	public void run() {
		while(true){
			int k = readInt("Enter integer: ");
			if(k == q){
				println("not " + q);
				break;
			}else{
				println(k);
			}
		}
	}
}
