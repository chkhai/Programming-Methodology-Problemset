import acm.program.ConsoleProgram;

//კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს
//შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m.

public class Problem61 extends ConsoleProgram{
	
	private int k = 0;
	private int t = 0;

	public void run(){
		int m = readInt("Enter Number: ");
		int n = readInt("Enter Number: ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=readInt("Enter nums: ");
		}
		checkTheSums(arr, m);
		if(k != 0 && t != 0){
			println(k + " + " + t + " = " + m);
		}else{
			println("Can't find the sum.");
		}
			
	}

	private void checkTheSums(int[] arr, int m) {
		for(int i=0; i<arr.length - 1; i++){
			for(int j=i + 1; i<arr.length -1; j++){
				if(arr[i]+arr[j]==m){
					k = arr[i];
					t = arr[j];
				}
			}
		}
	}

}
