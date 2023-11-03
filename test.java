import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class test extends GraphicsProgram{
	private static final int width = 30;
	private static final int height = 40;
	public void run() {
		int x = 100;
		int y = 200;
		createCircle(x, y, width, height);
	}
	private void createCircle(int x, int y, int width2, int height2) {
		GOval oval = new GOval(x, y , width, height);
		add(oval);
	}
}
