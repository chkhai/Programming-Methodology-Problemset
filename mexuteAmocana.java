import acm.program.ConsoleProgram;
//not finished
public class mexuteAmocana extends ConsoleProgram{
	private static final int SENTINEL = 0;
	public void run() {
		println("This program finds smallest and largest numbers. ");
		int k = readInt("? ");
		int max = k;
		int min = k;
	/*	while(k != SENTINEL){
			int m = readInt("? ");
			if(m == SENTINEL){
				break;
			}
			if(m > max){
				max = m; 
			}	
			if(m < min){
				min = m;
			}
		}
		*/	
		checkNumbers(k, max, min);
		println("largest: " + max);
		println("smallest: " + min);
	}
	private void checkNumbers(int k, int max, int min) {
		while(k != SENTINEL){
			int m = readInt("? ");
			if(m == SENTINEL){
				break;
			}
			if(m > max){
				max = m; 
			}	
			if(m < min){
				min = m;
			}
			
		}
		
	}
}


//if(k == SENTINEL){
//println("not " + SENTINEL);
//break;
//}