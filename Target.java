/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Target extends GraphicsProgram {
	private static final double BIG_RADIUS = 72;
	private static final double MIDDLE_RADIUS = BIG_RADIUS * 165 / 254;
	private static final double SMALL_RADIUS = BIG_RADIUS * 76 / 254;

	public void run() {
		drawFirstCircle();
		drawSecondCircle();
		drawThirdCircle();
	}
	
	/* This method creates the smallest circle, fills it and colors it red.
	 */
	private void drawThirdCircle() {
		double x = getWidth() / 2 - SMALL_RADIUS;
		double y = getHeight() / 2 - SMALL_RADIUS;
		GOval thirdCircle = new GOval(x, y, 2 * SMALL_RADIUS, 2 * SMALL_RADIUS);
		thirdCircle.setFilled(true);
		thirdCircle.setColor(Color.RED);
		add(thirdCircle);
	}
	
	/*
	 */
	private void drawSecondCircle() {
		double x = getWidth() / 2 - MIDDLE_RADIUS;
		double y = getHeight() / 2 - MIDDLE_RADIUS;
		GOval secondCircle = new GOval(x, y, 2 * MIDDLE_RADIUS, 2 * MIDDLE_RADIUS);
		secondCircle.setFilled(true);
		secondCircle.setColor(Color.white);
		add(secondCircle);
	}

	/*
	 * 
	 */
	private void drawFirstCircle() {
		double x = getWidth() / 2 - BIG_RADIUS;
		double y = getHeight() / 2 -BIG_RADIUS;
		GOval firstCircle = new GOval(x, y, 2 * BIG_RADIUS,
				2 * BIG_RADIUS);
		firstCircle.setFilled(true);
		firstCircle.setColor(Color.RED);
		add(firstCircle);
	}
}