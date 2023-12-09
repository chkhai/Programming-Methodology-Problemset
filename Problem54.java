import acm.program.ConsoleProgram;

//54. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, იპოვეთ და დაბეჭდეთ ამ
//რიცხვებს შორის ორი მაქსიმალური რიცხვი.

public class Problem54 extends ConsoleProgram{
	
	public void run() {
		
		int k = readInt("Enter number:");
		while(k <= 0){
			println("Number must be positive!");
			k = readInt("Enter number");
		}
		int[] nums = new int[k];
		int max = nums[0];
		int min = nums[1];
		for(int i = 0; i < nums.length; i++){
			nums[i] = readInt("Enter number:");
			if(nums[i] > max){
				max = nums[i];
			}else if(nums[i] < min){
				min = nums[i];
			}
			
		}
		println("Maximum number is " + max);
		println("Minimum number is " + min);
		
	}
}
