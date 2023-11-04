
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem33 extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int MAX_RADIUS = 100;
	private static final int MIN_RADIUS = 50;

	public void run(){
		addRandomCircle();
	}

	private void addRandomCircle() {
		int radius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - 2* radius);
		GOval oval = new GOval(2*radius, 2*radius);
		add(oval, x, y);
	}
}
