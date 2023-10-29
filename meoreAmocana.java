import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class meoreAmocana extends GraphicsProgram{
	
	public void run() {
		drawFirstCircle();
		drawSecondCircle();
	//	drawThirdCircle();
	}

	private void drawSecondCircle() {
		GOval secondCircle = new GOval
	}

	private void drawFirstCircle() {
		GOval firstCircle = new GOval(getWidth() / 2 - 72, getHeight() / 2 - 72, 144, 144);
		firstCircle.setFilled(true);
		firstCircle.setColor(Color.RED);
		add(firstCircle);
	}
}
