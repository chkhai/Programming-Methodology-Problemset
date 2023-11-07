import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int RADIUS = 25;

	public void run() {
		GOval circle = new GOval(0, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.red);
		add(circle);
		while(circle.getX() != getWidth() / 2 - RADIUS){
			circle.move(1, 0);
			pause(5);
		}
	}
}
