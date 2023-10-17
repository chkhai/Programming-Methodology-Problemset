import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram{
	//კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათ შორის მაქსიმალური.
	
	public void run() {
		double a = readInt("Enter real number: ");
		double b = readInt("Enter real number: ");
		if(a > b) {
			println(a);
		}else{
			println(b);
		}
	}
}
