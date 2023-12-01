import acm.program.ConsoleProgram;

//თქვენი ამოცანაა დაადგინოთ არის თუ არა მომხმარებლის მიერ შემოყვანილი რიცხვები
//არითმეტიკული პროგრესია. ამისათვის თქვენ უნდა დაწეროთ კონსოლის პროგრამა.
//ჩათვალეთ რომ მომხმარებელს მხოლოდ მთელი რიცხვები შემოჰყავს მანამ სანამ არ
//შემოიყვანს -1. როგორც კი მომხმარებელი -1 შემოიყვანს თქვენმა პროგრამამ უნდა
//დაბეჭდოს სტრინგი “Arithmetic progresson” თუკი შეყვანილი მიმდევრობა
//არითმეტიკული პროგრესიია და უნდა დაბეჭდოს სტრინგი “Not an arithmetic
//porgression” წინააღმდეგ შემთხვევაში. რის შემდეგაც პროგრამამ უნდა დაასრულოს
//მუშაობა

public class ArithmeticProgression extends ConsoleProgram{
	private static final int SENTINEL = -1;
	public void run(){
		int n = readInt("Enter number: ");
		int count = n;
		while(true){
			int k = readInt("Enter number: ");
			count = k - n;
			n = k;
			if(k == SENTINEL){
				break;
			}

		}
	}
}
