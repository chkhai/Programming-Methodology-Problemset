import acm.program.ConsoleProgram;

/*კონსოლიდან წაიკითხეთ ნამდვილი რიცხვი და დაბეჭდეთ მისი მთელი ნაწილი და მისი
წილადი ნაწილი. მაგალითად მომხმარებელმა თუ შეიყვანა 3.14 თქვენმა პროგრამამ უნდა
დაბეჭდოს 3 და 0.14
*/

public class Problem17 extends ConsoleProgram{

	
	public void run() {
		
		double a = readDouble("Enter real number: ");
		int integerPart = (int)a;
		double fractionPart = a - integerPart;
		
		println("integerPart is: " + integerPart);
		println("fractionPart is: " + fractionPart);
		
	}
}
