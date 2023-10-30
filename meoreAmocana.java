import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class meoreAmocana extends GraphicsProgram {
	private static final double BIG_RADIUS = 72;
	private static final double MIDDLE_RADIUS = BIG_RADIUS * 165 / 254;
	private static final double SMALL_RADIUS = BIG_RADIUS * 76 / 254;
	public void run() {
		drawFirstCircle();
		drawSecondCircle();
		drawThirdCircle();
	}

	private void drawThirdCircle() {
		GOval thirdCircle = new GOval(getWidth() / 2 - 21.5, getHeight() / 2 - 21.5, 43, 43);
		thirdCircle.setFilled(true);
		thirdCircle.setColor(Color.RED);
		add(thirdCircle);
	}

	private void drawSecondCircle() {
		GOval secondCircle = new GOval(getWidth() / 2 - 46.7, getHeight() / 2 - 46.7, 93.4, 93.4);
		secondCircle.setFilled(true);
		secondCircle.setColor(Color.white);
		add(secondCircle);
	}

	private void drawFirstCircle() {
		GOval firstCircle = new GOval(getWidth() / 2 - BIG_RADIUS, getHeight() / 2 - BIG_RADIUS, 2*BIG_RADIUS, 2*BIG_RADIUS);
		firstCircle.setFilled(true);
		firstCircle.setColor(Color.RED);
		add(firstCircle);
	}
}