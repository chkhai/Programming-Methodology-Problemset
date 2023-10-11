import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problemhome extends GraphicsProgram{
	public void run(){
		GRect outline = new GRect(160, 160, 400, 200);
		add(outline);
		GLine line = new GLine(160, 160, 360, 80);
		add(line);
		GLine SecondLine = new GLine(560, 160, 360, 80);
		add(SecondLine);
		GRect door = new GRect(180, 220, 80, 40);
		add(door);
	}
}
