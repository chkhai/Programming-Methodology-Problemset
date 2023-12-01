import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.input.MouseEvent;

public class Flicker extends GraphicsProgram{
	private static final int RAD = 30;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	GObject obj;
	GOval oval = new GOval(2*RAD, 2*RAD);
	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		double x = e.getX();
		double y = e.getY();
		add(oval, x - RAD, y - RAD);
	}
}
