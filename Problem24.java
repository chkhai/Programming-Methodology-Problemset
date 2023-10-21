import acm.program.ConsoleProgram;
//მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების
//რაოდენობა
public class Problem24 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter real number: ");
		for(int i = 1; i < n; i++) {
			if(n % i == 0){
				int j = 1;
				j += j;
				println(j);
			}
		}
	}
}
