import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem40 extends GraphicsProgram {
	private static final int RADIUS = 25;

	public void run() {
		GOval circle = new GOval(0, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.red);
		add(circle);
		smashToVerticalWalls(circle);
	}

	private void smashToVerticalWalls(GOval circle) {
		while (true) {
			while (circle.getX() != getWidth() - 2 * RADIUS) {
				circle.move(1, 0);
				pause(5);
			}
			while (circle.getX() != 0){
				circle.move(-1, 0);
				pause(5);
			}
		}
	}
	
	
}
