import java.util.Arrays;

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
		int[] count1= getCount(str1);
		int[] count2= getCount(str2);
		
		return Arrays.equals(count1, count2);
	}
	
	
	private int[] getCount(String s){
		int[] counts = new int[26];
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			int index = ch - 'a';
			counts[index]++; 
		}
		return counts;
	}
	
	
}
