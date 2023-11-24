import acm.program.ConsoleProgram;
//შესაძლებელია თუ არა ერთი სიტყვის სიმბოლოებისგან მეორე სიტყვის მიღება? ამ ამოცანის
//გადასაჭრელად დაწერეთ მეთოდი spellWord, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს
//ბულეანს. თქვენი მიზანია პირველი სტრინგიდან მეორე მიიღოთ. ამისათვის შეგიძლიათ პირველი
//სტრინგიდან გარკვეული სიმბოლოების ამოჭრათ ხოლო დარჩენილი სიმბოლოები
//გადააადგილოთ როგორც გინდათ ისე. თუკი პირველი სტრინგიდან მეორის მიღება შესაძლებელია
//მაშინ მეთოდი უნდა აბრუნებდეს true-ს, წინააღმდეგ შემთხვევაში false-ს.
//მაგალითად თუკი გადმოგეცათ სტრინგები “gamarjoba” და “baro” მაშინ მეთოდმა უნდა
//დააბრუნოს true. ხოლო თუ გადმოგეცათ სტრინგები “gamarjoba” და “oboba” მაშინ მეთოდმა
//უნდა დააბრუნოს false.

public class MidTerm13 extends ConsoleProgram{
	
	public void run() {
		String main = readLine("Enter a word: ");
		String second = readLine("Enter a word to see if we can spell it: ");
		if(spellWord(main, second)){
			println("true");
		}else{
			println("false");
		}
	}
	
	private boolean spellWord(String main, String second){
		for(int i = 0; i < main.length(); i++){
			
		
		}
		return false;
	}
}
