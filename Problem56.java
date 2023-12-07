import java.util.Arrays;

import acm.program.ConsoleProgram;

//კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, დაალაგეთ რიცხვები
//ზრდადობით და დაბეჭდეთ.

public class Problem56 extends ConsoleProgram{

	public void run() {
		int k = readInt("Enter number: ");
		int[] arr = new int[k];
		for(int i = 0; i < arr.length; i++){
			arr[i] = readInt("Enter number: ");
		}
		sort(arr);
		println(Arrays.toString(arr));
	}

	private void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++){
////			int min = findMin(arr);
//			if(arr[i] < min){
//				swap(min, arr, i);
//			}
			
			
		}
		
	}
//
//	private int findMin(int[] arr) {
//		for(int min = )
//	}

	private void swap(int min, int[] arr, int i) {
		int temp = min;
		min = arr[i];
		arr[i] = temp;
		
	}
	
}
