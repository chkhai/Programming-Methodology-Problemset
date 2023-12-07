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
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				swap(min, arr, i);
			}
			
			
		}
		
	}

	private void swap(int min, int[] arr, int i) {
		int temp = min;
		min = arr[i];
		arr[i] = temp;
		
	}
	
}
