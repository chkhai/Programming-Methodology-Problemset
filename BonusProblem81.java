

import java.awt.Font;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class BonusProblem81 extends GraphicsProgram{
	public void run() {
		GLabel london = new GLabel("london");
		london.setFont(Font.SERIF, 40);
		add(london, getHeight()/2, getWidth()/2);
	}
}
