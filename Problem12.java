import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {

	public void run(){
		GRect house = new GRect(150, 100, 300, 300);
		add(house);
		GLine firstline = new GLine (300, 50, 150, 100);
		add(firstline);
		GLine secondline = new GLine (300, 50, 450, 100);
		add(secondline);
		GRect door = new GRect (210, 400, 100, 100);
		add(door);
		
	}
}
