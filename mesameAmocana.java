import acm.graphics.*;
import acm.program.GraphicsProgram;

public class mesameAmocana extends GraphicsProgram{
	private static final int RECT_HEIGHT = 12;
	private static final int RECT_WIDTH = 30;

	public void run() {
		GLabel program = new GLabel("Program");
		add(program, getWidth() / 2 - program.getWidth(), getHeight() / 2 - program.getAscent());
		
	}
}
