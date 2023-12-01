import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.input.MouseEvent;

public class Flicker extends GraphicsProgram{
	private static final int RAD = 30;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	GObject obj;
	GOval oval;
	public void run(){
		oval = new GOval(2*RAD, 2*RAD);
		add(oval);
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		obj = getElementAt(e.getX() - RAD, e.getY()-RAD);
		double x = e.getX() - RAD;
		double y = e.getY() - RAD;
		drawCircle(x, y);
		flicker();
	}
	
	private void flicker() {
		if(obj != null){
			int k = rgen.nextInt(1,5);
			if(k==1){
				obj.setColor(Color.BLUE);
			}else if(k==2){
				obj.setColor(Color.GREEN);
			}else if(k==3){
				obj.setColor(Color.RED);
			}else if(k==4){
				obj.setColor(Color.BLACK);
			}else if(k==5){
				obj.setColor(Color.YELLOW);
			}
		}
	}

	private void drawCircle(double x, double y){
		if(obj == null){
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval, x, y);
		}
	}
}
