import java.util.ArrayList;

import acm.program.ConsoleProgram;

//კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი
//რიცხვები შებრუნებული მიმდევრობით.

public class Problem60 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while(true){
			int k = readInt("Enter number: ");
			if(k == SENTINEL){
				break;
			}
			arrayList.add(k);
		}
		reverseArray();
		
	}

	private void reverseArray() {
		
		
	}
	
	
}
