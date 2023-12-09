import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{

	public void run() {
		int k = readInt("Enter natural numer: ");
		k = checkTheInput(k);
		int[] arr = new int[k];
		if(arrIsSorted(arr)){
			println("Array is sorted!");
		}else{
			println("Array is not sorted!");
		}	
	}
	
	private boolean arrIsSorted(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] > arr[i + 1]){
				return false;
			}
		}
		return true;
	}
	
	private int checkTheInput(int k) {
		while(k <= 0){
			println("Number must be positive!");
			k = readInt("Enter natural number: ");
		}
		return k;
	}
}
