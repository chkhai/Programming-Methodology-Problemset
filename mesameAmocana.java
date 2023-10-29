import acm.graphics.*;
import acm.program.GraphicsProgram;
//not finished
public class mesameAmocana extends GraphicsProgram{
	private static final int RECT_HEIGHT = 12;
	private static final int RECT_WIDTH = 30;

	public void run() {
		drawConsoleProgramRectAndLabel();
	}

	private void drawConsoleProgramRectAndLabel() {
		double x = getWidth() / 2 - RECT_WIDTH;
		double y = getHeight() / 2 - RECT_HEIGHT;
		GRect consoleProgram = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(consoleProgram);
		
	}
}
