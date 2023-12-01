import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
//გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე
//ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს.
public class Flicker extends GraphicsProgram{
	private static final int RADIUS = 25;
	private GOval circle;
	public void run() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.pink);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e){
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
	}
	
}