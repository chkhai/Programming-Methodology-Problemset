import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.input.MouseEvent;

public class Flicker extends GraphicsProgram{
	private static final int RAD = 30;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	GOval circle;
	GOval oval = new GOval(2*RAD, 2*RAD);
	public void run() {
		circle = new GOval(2 * RAD, 2 * RAD);
		circle.setFilled(true);
		circle.setColor(Color.pink);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e){
		add(circle, e.getX() - RAD, e.getY() - RAD);
	}
}
