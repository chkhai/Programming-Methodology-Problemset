import acm.program.ConsoleProgram;

public class Problem19 extends ConsoleProgram{
	
//კონსოლიდან წაიკითხეთ მთელი რიცხვი n და შემდეგ n ჯერ დაბეჭდეთ “hello ” + i, სადაც i
//	იცვლება 0 დან n-1 მდე.
	public void run() {
		double n = readInt("Enter real number");
		for(n=0; n<n+1; n++){
			println("hello");
		}
	}
}
