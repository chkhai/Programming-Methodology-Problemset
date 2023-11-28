import acm.program.ConsoleProgram;

////კონსოლიდან შემოდის ტექსტი. დაბეჭდეთ True თუ ტექსტში არსებული ყველა 
//lowercase ინგლისური ასო ზრდადობით არის დალაგებული, False თუ არაა. ტექსტში სხვა სიმბოლოებიც
//შეიძლება შეგხვდეთ და იმათ ყურადღება არ მიაქციოთ.  მაგ: “a bcAAA!” -> true, “” -> true “ABCDz,a” -> 
//false (Practice02)Tags: String, char, charOperations, isLowerCase   



public class MidtermPractice extends ConsoleProgram{
	
	public void run() {
		String str = readLine("Enter string: ");
		if(strIncr(str)){
			println("true");
		}else{
			println("false");
		}
	}

	private boolean strIncr(String str) {
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)){
				for(int j = 0; j < str.substring(i).length(); j++){
					char chch = str.charAt(j);
					if(Character.isLowerCase(chch)){
						return false;
					}
				}
			}
		}
		return true;
	}

}
