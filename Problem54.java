import acm.program.ConsoleProgram;

//54. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, იპოვეთ და დაბეჭდეთ ამ
//რიცხვებს შორის ორი მაქსიმალური რიცხვი.

public class Problem54 extends ConsoleProgram{
	
	public void run() {
		
		int k = readInt("Enter number:");
		k = checkTheInput(k);
		int[] nums = new int[k];
		int max = nums[0];
		int min = nums[1];
		detectMinAndMax(nums, min, max);
		println("Maximum number is " + max);
		println("Minimum number is " + min);
		
	}

	private void detectMinAndMax(int[] nums, int max, int min) {
		for(int i = 0; i < nums.length; i++){
			nums[i] = readInt("Enter number:");
			if(nums[i] > max){
				max = nums[i];
			}else if(nums[i] < min){
				min = nums[i];
			}
			
		}
		
	}

	private int checkTheInput(int k) {
		while(k <= 0){
			println("Number must be positive!");
			k = readInt("Enter number");
		}
		return k;
	}
}
