import acm.program.ConsoleProgram;
//მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს 1 დან n მდე რიცხვების
//ჯამი
public class Problem23 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter real number: ");
		int sum = 0;
		for(int i = 0; i < n+1; i++){
			sum = sum + i;
		}
		println(sum);
	}
}
