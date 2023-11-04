import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

 /*რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი, შემდეგ ხდება რულეტკის
დატრიალების სიმულაცია, კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა
დადებულმა რიცხვმა
*/
public class Problem37 extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int number = readInt("Enter number between 0 and 36: ");
		if(number > 36 || number < 0){
			println("number must be between 0 and 36");
			int k = readInt("Enter number between 0 and 36: ");
			k = number;
		}
		int luckyNumber = rgen.nextInt(0, 36);
		if(luckyNumber == number){
			println("You won!");
		} else {
			println("you lose! Your number was " + number);
		}
		println("The lucky number was " + luckyNumber);
	}
}
