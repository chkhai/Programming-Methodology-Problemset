import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,
//ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.

public class Problem51 extends ConsoleProgram{
	
	public void run(){
		String str = readLine("Enter string: ");
		str = updateStr(str);
		println(str);
	}
	
	private String updateStr(String str) {
		String result = "";
		for(int i =0; i< str.length(); i++){
			char ch = str.charAt(i);
			int m = result.indexOf(ch);
			if(m == - 1){
				result += ch;
			}
		}
		return result;	
	}

}
