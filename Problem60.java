import java.util.ArrayList;

import acm.program.ConsoleProgram;

//კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი
//რიცხვები შებრუნებული მიმდევრობით.

public class Problem60 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			int k = readInt("Enter number: ");
			if(k == SENTINEL){
				break;
			}
			 list.add(k);
		}
		printReverseArray(list);
		
	}

	private void printReverseArray(ArrayList<Integer>  list) {
		for(int i = list.size() - 1; i >= 0 ; i--){
			println(list.get(i));
		}
	}

	

}
