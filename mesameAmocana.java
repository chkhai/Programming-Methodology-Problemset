import acm.graphics.*;
import acm.program.GraphicsProgram;
//not finished
public class mesameAmocana extends GraphicsProgram{
	private static final int RECT_HEIGHT = 80;
	private static final int RECT_WIDTH = 200;

	public void run() {
		drawConsoleProgramRectAndLabel();
	}

	private void drawConsoleProgramRectAndLabel() {
		double x = getWidth() / 2 - RECT_WIDTH / 2;
		double y = getHeight() / 2;
		GRect rect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(rect);
		GLabel label = new GLabel("ConsoleProgram");
		add(label, 3 * x / 2 + label.getWidth() / 2, 3 * y / 2 + label.getAscent() / 2);
	}
}
