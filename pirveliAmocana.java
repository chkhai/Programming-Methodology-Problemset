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
		for(int j = 1; j < BRICKS_IN_BASE + 1; j++) {
			int x = getWidth() / 2 - (BRICKS_IN_BASE / 2)* BRICK_WIDTH;
			int y = getHeight() - j * BRICK_HEIGHT;
			GRect brick = new brick(x, y, BRICK_WIDTH, BRICK_HEIGHT);
		}		
	}
}
