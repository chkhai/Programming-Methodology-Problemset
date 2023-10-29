import acm.graphics.*;
import acm.program.GraphicsProgram;
//not finished
public class pirveliAmocana extends GraphicsProgram{
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE= 14;

	public void run() {
		for(int i =0; i < BRICKS_IN_BASE; i++) {
			drawHorisontalLineOfBricks(i);
		}
	}

	private void drawHorisontalLineOfBricks(int i) {
		for(int j = 0; j < BRICKS_IN_BASE; j++) {
			int x = getWidth() / 2 - BRICK_WIDTH * j;
			int y = getHeight() - BRICK_HEIGHT * i;
			GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
			add(brick);
		}
		
	}
}
