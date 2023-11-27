import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;

public class ScoreCounter extends GraphicsProgram{
	
	private static final int RAD = 100;
	
	private GRect rect;
	
	GLabel label;
	
	private int num;
	
	private int click1;
	
	public void run() {
		addMouseListeners();
		rect = new GRect(getWidth() / 2 - RAD, getHeight() / 2 - RAD, 2* RAD, 2* RAD);
		add(rect);
		num = 0;
		GLabel label = new GLabel(""+num);
		add(label, getWidth() / 2 , getHeight() / 2 );
		
	}
	

	public void mousePressed(MouseEvent e){
		click1 = e.getX();
	}
	
	public void mouseDragged(MouseEvent e){
		if(e.getX() > getWidth()/2 - RAD && e.getX() < getWidth()/2 + RAD &&
				e.getY() > getHeight()/2-RAD && e.getY() < getHeight()/2+RAD){
			System.out.println("bla");
			if(e.getX() > click1 && num!=9){
				num++;
			}else if(e.getX() < click1 && num!=0){
				num--;
			}
		}
	}
}
