//not finished
import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
//გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე
//ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს.
public class Problem41 extends GraphicsProgram{
	private static final int RADIUS = 25;

	public void run() {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.pink);
		addMouseListeners();
	}
}
