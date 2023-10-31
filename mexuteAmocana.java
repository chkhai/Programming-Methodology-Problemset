import acm.program.ConsoleProgram;
//not finished
public class mexuteAmocana extends ConsoleProgram{
	private static final int SENTINEL = 0;
	public void run() {
		while(true){
			int k = readInt("Enter integer: ");
			if(k == SENTINEL){
				println("not " + SENTINEL);
				break;
			}else{
				println(k);
			}
		}
	}
}
