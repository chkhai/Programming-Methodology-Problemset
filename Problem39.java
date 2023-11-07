import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int RADIUS = 25;
	private static final int PAUSE_TIME = 5;
	public void run() {
		ballFloat();
	}
	
	private void ballFloat(){
		GOval circle = new GOval(0, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.red);
		add(circle);
		while(circle.getX() != getWidth() / 2 - RADIUS){
			double dx = 1;
			double dy = 0;
			circle.move(dx, dy);
			pause(PAUSE_TIME);
		}
	}
}
