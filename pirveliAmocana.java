import acm.graphics.*;
import acm.program.GraphicsProgram;

//not finished
public class pirveliAmocana extends GraphicsProgram {
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			makeHorisontalRowOfBricks(i);
		}
	}

	private void makeHorisontalRowOfBricks(int i) {
		double x = getWidth() / 2 - BRICK_WIDTH * (BRICKS_IN_BASE - i)/ 2;
		double y = getHeight() - i * BRICK_HEIGHT;
		for(int j = 0; j<BRICKS_IN_BASE; j++){
			x = x + BRICK_WIDTH * (BRICKS_IN_BASE - i);
			GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
			add(rect);
		}
	}
}
