import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Flicker extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private static final int CIRCLE_D = 50;

	private GObject obj;

	private GOval oval = new GOval(CIRCLE_D, CIRCLE_D);

	public void run() {

		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		double x = e.getX() - CIRCLE_D / 2;
		double y = e.getY() - CIRCLE_D / 2;
		obj = getElementAt(x, y);
		if (obj == null) {
			add(oval, x, y);
		} else {
			flicker();
		}
	}

	private void flicker() {
//		int n = rgen.nextInt(1, 5);
		while (true) {
			int n = rgen.nextInt(1, 5);
			if (n == 1) {
				obj.setColor(Color.BLUE);
			} else if (n == 2) {
				obj.setColor(Color.BLACK);
			} else if (n == 3) {
				obj.setColor(Color.RED);
			} else if (n == 4) {
				obj.setColor(Color.YELLOW);
			} else if (n == 5) {
				obj.setColor(Color.GREEN);
			}
			pause(10);
		}

	}

}