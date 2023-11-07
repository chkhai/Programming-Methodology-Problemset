import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
//გრაფიკულ პროგრამაში გააკეთეთ მონეტის აგდების სიმულაციის თამაში.
//მონეტა არის წრე, რომელსაც ერთი მხარე აქვს წითელი და აწერია heads, მეორე მხარე აქვს მწვანე და აწერია tails.

public class Coinflip extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int PAUSE_TIME = 10;

	public void run() {
		GOval circle1 = drawCircle(Color.red);
	}

	private GOval drawCircle(Color red) {
		GOval circle1 = new GOval(getWidth() / 2 - 100, getHeight() / 2 - 100, 200, 200);
		circle1.setFilled(true);
		circle1.setColor(Color.red);
		add(circle1);
		return circle1;
	}
}
