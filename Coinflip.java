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
		drawCircle(Color.red);
		drawCircle(Color.green);
		waitForClick();
		

	}

	private void drawCircle(Color color) {
		GOval circle = new GOval(getWidth() / 2 - 100, getHeight() / 2 - 100, 200, 200);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}

}
