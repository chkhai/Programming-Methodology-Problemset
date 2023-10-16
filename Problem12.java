import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {

	public void run(){
		GRect house = new GRect(150, 100, 300, 300);
		add(house);
		GLine firstline = new GLine (300, 30, 150, 100);
		add(firstline);
		GLine secondline = new GLine (300, 30, 450, 100);
		add(secondline);
		GRect door = new GRect (250, 250, 100, 150);
		add(door);
		GRect firstwindow = new GRect (200, 150, 50, 50);
		add(firstwindow);
		GRect secondwindow = new GRect (350, 150, 50, 50);
		add(secondwindow);
		house.setFilled(true);
		house.setColor(Color.LIGHT_GRAY);
		door.setFilled(true);
		door.setColor(Color.GREEN);
		firstwindow.setFilled(true);
		firstwindow.setColor(Color.darkGray);
		
	}
}
