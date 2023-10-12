import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problemhome extends GraphicsProgram{
	//constant
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 300;
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 60;
	private static final double ROOF_HEIGHT = 100;

	public void run(){
		//drawMidLine();
		drawHouse();
	}

	private void drawHouse() {
		drawWall();
		drawRoof();
		drawDoor();
		drawWindows();
	}

	private void drawRoof() {
		double x1 = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		double y1 = getHeight() - HOUSE_HEIGHT;
		double x2 = x1 + HOUSE_WIDTH;
		double y2 = y1 - ROOF_HEIGHT;
		GLine leftRoof = new GLine();
	}

	private void drawWall() {
		GRect rect = new GRect (HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		double y = getHeight() - HOUSE_HEIGHT;
		add(rect, x, y);
	}

	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = y1;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}
	
}
