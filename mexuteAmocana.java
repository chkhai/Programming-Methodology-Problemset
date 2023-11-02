import acm.program.ConsoleProgram;
//not finished
public class mexuteAmocana extends ConsoleProgram{
	private static final int SENTINEL = 0;
	public void run() {
		println("This program finds smallest and largest numbers. ");
		int k = readInt("?");
		int max = k;
		int min = k;
		while(k != SENTINEL){
			int m = readInt("?");
			if(m > max){
				max = m; 
			}	
			if(m < min){
				min = m;
			}
		}
		println(max);
		println(min);
	}
}


//if(k == SENTINEL){
//println("not " + SENTINEL);
//break;
//}