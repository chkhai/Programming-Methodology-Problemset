import acm.graphics.*;
import acm.program.GraphicsProgram;
//not finished
public class mesameAmocana extends GraphicsProgram{
	private static final int RECT_HEIGHT = 100;
	private static final int RECT_WIDTH = 400;

	public void run() {
		drawConsoleProgramRectAndLabel();
		//drawGraphicsProgramRectAndLabel();
	}

	//private void drawGraphicsProgramRectAndLabel() {
		
		
	//}

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
