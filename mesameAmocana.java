import acm.graphics.*;
import acm.program.GraphicsProgram;
//not finished
public class mesameAmocana extends GraphicsProgram{
	private static final int RECT_HEIGHT = 80;
	private static final int RECT_WIDTH = 200;
	private static final int DIFFERENCE_BETWEEN_RECTS = 30;

	public void run() {
		drawConsoleProgramRectAndLabel();
		drawGraphicsProgramRectAndLabel();
	}

	private void drawGraphicsProgramRectAndLabel() {
		double x = getWidth() / 2 - 3 * RECT_HEIGHT / 2 - DIFFERENCE_BETWEEN_RECTS;
		double y = getHeight() / 2;
		GRect rect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(rect);
		//GLabel label = new GLabel("GraphicsProgram");
		//double m = x + RECT_WIDTH / 2 - label.getWidth() / 2;
		//double n = y + RECT_HEIGHT / 2 + label.getAscent() / 2;
		//add(label, m, n);
	}

	private void drawConsoleProgramRectAndLabel() {
		double x = getWidth() / 2 - RECT_WIDTH / 2;
		double y = getHeight() / 2;
		GRect rect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(rect);
		GLabel label = new GLabel("ConsoleProgram");
		double m = x + RECT_WIDTH / 2 - label.getWidth() / 2;
		double n = y + RECT_HEIGHT / 2 + label.getAscent() / 2;
		add(label, m, n);
	}
}
