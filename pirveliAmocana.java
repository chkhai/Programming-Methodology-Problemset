import acm.graphics.*;
import acm.program.GraphicsProgram;

//not finished
public class pirveliAmocana extends GraphicsProgram {
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			makeHorisontalRowOfBricks();
		}
	}

	private void makeHorisontalRowOfBricks() {
		for(int j = 0; j < BRICKS_IN_BASE ; j++) {
			if(j % 2 == 1){
				double x = getWidth() / 2 - BRICKS_IN_BASE * j / 2;
				double y = getHeight() - j * BRICK_HEIGHT;
				for(int m = 0; m < BRICKS_IN_BASE / 2; m++ ){
					GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
					add(rect);
				}
			}else{
				double x = getWidth() / 2 - BRICKS_IN_BASE * j / 2;
				double y = getHeight() - j * BRICK_HEIGHT - BRICK_HEIGHT / 2;
				for(int m = 0; m < BRICKS_IN_BASE / 2; m++ ){
					GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
					add(rect);
				}
			}
		}
	}
}
