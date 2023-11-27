import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import javafx.scene.input.MouseEvent;

public class Flicker extends GraphicsProgram{
	private static final int RAD = 30;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj == null){
			GOval oval = new GOval(e.getX() - RAD, e.getY() - RAD);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval);
		}else if(obj != null){
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
	
}
