import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class meoreAmocana extends GraphicsProgram {
	private static final double BIG_RADIUS = 72;
	private static final double MIDDLE_RADIUS = BIG_RADIUS * 165 / 254;
	private static final double SMALL_RADIUS = BIG_RADIUS * 76 / 254;

	public void run() {
		double x1= getWidth() - BIG_RADIUS;
		double y1 = getHeight() - BIG_RADIUS;
		createCircle(x1, y1, 2*BIG_RADIUS, 2*BIG_RADIUS);
	}
}