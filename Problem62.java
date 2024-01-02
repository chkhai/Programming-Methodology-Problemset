import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

//კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს. დაბეჭდეთ
//სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი.

public class Problem62 extends ConsoleProgram{

	private Map<String, Integer> namesList = new HashMap<String, Integer>();
	
	public void run(){
		while(true){
			String name = readLine("Enter name: ");
			if(name.equals("")) break;
			if(!namesList.containsKey(name)){
				namesList.put(name, 1);
			}else{
				namesList.put(name, namesList.get(name)+1);
			}
		}
		
		printNamesList();
		
	}

	private void printNamesList() {
		for(String str : namesList.keySet()){
			println(str + " number of times typed in: " + namesList.get(str));
		}
		
	}
}
