import acm.program.ConsoleProgram;

//ტექსტში, რომელშიც ერთიდაიგივე სიმბოლო გვერდიგვერდ არ გვხდებოდა, ვიღაც
//ბოროტმა კაცმა სხვადასხვა ადგილებში ჩაამატა ერთიდაიგივე სიმბოლოები ორ-ორად,
//ერთმანეთის გვერდით. ამ ჩამატებულ და შეცვლილ სტინგში კიდევ ჩაამატა
//ერთმანეთის გვერდით ერთიდაიგივე სიმბოლოები და ა.შ. სანამ არ მობეზრდა.
//“How are you?” -&gt; “How are yoxxu?” -&gt; “Hoyyw are yoxxu?” -&gt; “Hoyyw are
//yoxzzxu?” -&gt; “Hoyyw aaare yoxzzxu?”.
//თქვენი ამოცანაა აღადგინოთ საწყისი ტექსტი. ამისათვის უნდა დაწეროთ unEvilText()
//მეთოდი რომელსაც გადაეცემა სტრინგი და აბრუნებს სტრინგს. გადაცემულ სტრინგში
//წერია ბოროტი კაცის მიერ ზემოთ აღწერილი მეთოდით “გაფუჭებული” ტექსტი.
//მეთოდმა უნდა დააბრუნოს თავდაპირველი ტექსტი.

public class unEvilProblem extends ConsoleProgram{

	public void run() {
		String str = readLine("Enter string: ");
		str = restoreStr(str);
	}
	
	
	private String restoreStr(String str){
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			char chch = str.charAt(i+1);
			if(ch == chch){
				str = str.substring(0, i) + str.substring(i+2);
			}
		}
		return str;
	}
	
}
