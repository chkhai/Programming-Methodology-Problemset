import acm.program.ConsoleProgram;
//დაწერეთ მეთოდი getBiggestDivisor, რომელსაც გადაეცემა ნატურალური რიცხვი n და რომელიც
//აბრუნებს ამ რიცხვის ყველაზე დიდ მარტივ გამყოფს. ჩათვალეთ, რომ n>1
//მაგალითად 24-ის ყველაზე დიდი მარტივი გამყოფია 3, ხოლო 37-ის ყველაზე დიდი მარტივი
//გამყოფია 37
public class GetBiggestDivisor extends ConsoleProgram{
	
	public void run() {
		int a = readInt("Enter natural number: ");
		int BiggestDivisor = 1;
		for(int i = 1; i < a + 1; i++){
			if(a % i == 0 && isPrime(i)){
				BiggestDivisor = i;
			}
		}
		println("The biggest divisor of " + a + " is " + BiggestDivisor);
	}

	private boolean isPrime(int i) {
		for(int j = 2; j < i; j++){
			if(i % j == 0){
				return false;
				}
			}
		return true;
	}
}
