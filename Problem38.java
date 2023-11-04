import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/*მოხმარებელს აქვს საწყისი თანხა 1000, თამაშობს მანამ სანამ არ წააგებს ყველაფერს. ყოველ
ჯერზე შეყავს ფსონის თანხა და რიცხვი რომელზეც დებს. ხდება რულეტკის დატრიალების
სიმულაცია(0-დან 36-მდე შემთხვევითი რიცხვი), მოგების შემთხვევაში მოთამაშეს
უორმაგედბა დადებული თანხა წაგების შემთხვევაში კი მოთამაშე კარგავს დადებულ თანხას.
მოთამაშე მოგებულია მაშინ თუ რულეტკაზე ამოსული რიცხვი ემთხვევა მის მიერ დადებულ
რიცხვს. პროგრამა ყოველ მოქმედებაზე უნდა ბეჭდავდეს შესაბამის შეტყობინებას, ადვილად
რომ გაერკვეს მოთამაშე, რა რიცხვი ამოვიდა, რამდენი წააგო, რამდენი მოიგო, რამდენი აქვს
ბალანსი.
*/
public class Problem38 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		while (true) {
			int money = 1000;
			money = playTheGame(money);
			if(money == 0){
				break;
			}
		}
	}

	private int playTheGame(int money) {
		int number = readInt("Enter number between 0 and 36: ");
		while (number > 36 || number < 0) {
			println("Number must be between 0 and 36!");
			int secondNumber = readInt("Enter number between 0 and 36: ");
			number = secondNumber;
		}
		int betMoney = readInt("How much would you like to bet? ");
		while (betMoney > money) {
			println("You don't have that much money.");
			int secondBetMoney = readInt("How much would you like to bet? ");
			betMoney = secondBetMoney;
		}
		int luckyNumber = rgen.nextInt(0, 36);
		if (luckyNumber == number) {
			println("Congrats, you win. The lucky number was " + luckyNumber + " and you guessed it!");
			money = money + betMoney;
			println("Your current money is " + money + ".");
		} else {
			println("Unfortunately, You lost. The lucky number was " + luckyNumber + " and you picked " + number + ".");
			money = money - betMoney;
			println("Your current money is " + money + ".");
		}
		if(money == 0){
			println("You don't have any money left! :(");
		}
		return money;

	}
}
