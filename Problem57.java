import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს true-ს თუკი ეს ორის
//სტრინგი ერთმანეთის ანაგრამაა, ხოლო წინააღმდე შემთხვევაში აბრუნებს false-ს. ჩათვალეთ,
//რომ ორივე სტრინგი მხოლოდ ლათინური ალფავიტის პატარა ასოებისგან შედგება.
//იმპლემენტაცია გააკეთეთ მასივების გამოყენებით შემდეგი ალგორითმით: თითოეული
//სიტყვისთვის დათვალეთ თითოეული სიმბოლოს რაოდენობა(‘a’-‘z’) და შეინახეთ მასივში.
//შემდეგ შეადარეთ ერთმანეთს მასივები.

public class Problem57 extends ConsoleProgram{

	public void run(){
		String str1 = "mariam";
		String str2 = "mraiam";
		println(areAnagrams(str1, str2));
	}

	private boolean areAnagrams(String str1, String str2) {
		int[] count1= new int[26];
		int[] count2= new int[26];
		
		for(int i = 0; i < str1.length(); i++){
			char ch = str1.charAt(i);
			int index = ch - 'a';
		}
		
		
		
		return false;
	}
	
	
}
