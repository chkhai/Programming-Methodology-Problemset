import acm.program.GraphicsProgram;

public class Problem13 extends GraphicsProgram{
	
	public void run() {
		drawMiddleLine();
	}

	private void drawMiddleLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y1 = y2;
		GLine line = new GLine(x1, y1, x2, y2);
	}
}
