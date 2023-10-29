import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class TargetProblem extends GraphicsProgram{
	
	public void run() {
		drawFirstCircle();
	//	drawSecondCircle();
	//	drawThirdCircle();
	}

	private void drawFirstCircle() {
		GOval firstCircle = new GOval(getWidth() - 72, getHeight() - 72, 144, 144);
		firstCircle.setFilled(true);
		firstCircle.setColor(Color.RED);
		add(firstCircle);
	}
}
