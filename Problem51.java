import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,
//ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.

public class Problem51 extends ConsoleProgram{
	
	public void run(){
		String str = readLine("Enter string: ");
		str = updateStr(str);
		println(str);
	}
	
	
	private String updateStr(String str){
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			int first = str.indexOf(ch);
			int last = str.lastIndexOf(ch);
			if(first != -1 && last !=-1 && last!=first){
				str = str.substring(0,last)+str.substring(last+1);
			}
		}
		return str;
	}
	
}
