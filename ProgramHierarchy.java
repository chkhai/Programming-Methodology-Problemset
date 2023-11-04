/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class ProgramHierarchy extends GraphicsProgram {
	private static final int RECT_HEIGHT = 80;
	private static final int RECT_WIDTH = 200;
	private static final int WIDTH_DIFFERENCE_BETWEEN_RECTS = 20;
	private static final int HEIGHT_DIFFERENCE_BETWEEN_RECTS = 50;

	public void run() {
		drawConsoleProgramRectAndLabel();
		drawGraphicsProgramRectAndLabel();
		drawDialogProgramRectAndLabel();
		drawProgramRectAndLabel();
		drawLines();
	}

	private void drawLines() {
		double x1 = getWidth() / 2;
		double y1 = getHeight() / 2 - HEIGHT_DIFFERENCE_BETWEEN_RECTS;
		double x2 = getWidth() / 2 - RECT_WIDTH - WIDTH_DIFFERENCE_BETWEEN_RECTS;
		double y2 = getHeight() / 2;
		double x3 = getWidth() / 2 + RECT_WIDTH + WIDTH_DIFFERENCE_BETWEEN_RECTS;
		double y3 = y2;
		GLine line1 = new GLine(x1, y1, x2, y2);
		GLine line2 = new GLine(x1, y1, getWidth() / 2, getHeight() / 2);
		GLine line3 = new GLine(x1, y1, x3, y3);
		add(line1);
		add(line2);
		add(line3);
	}

	private void drawProgramRectAndLabel() {
		double x = getWidth() / 2 - RECT_WIDTH / 2;
		double y = getHeight() / 2 - HEIGHT_DIFFERENCE_BETWEEN_RECTS - RECT_HEIGHT;
		GRect rect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(rect);
		GLabel label = new GLabel("Program");
		double m = x + RECT_WIDTH / 2 - label.getWidth() / 2;
		double n = y + RECT_HEIGHT / 2 + label.getAscent() / 2;
		add(label, m, n);
	}

	private void drawDialogProgramRectAndLabel() {
		double x = getWidth() / 2 + RECT_WIDTH / 2 + WIDTH_DIFFERENCE_BETWEEN_RECTS;
		double y = getHeight() / 2;
		GRect rect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(rect);
		GLabel label = new GLabel("DialogProgram");
		double m = x + RECT_WIDTH / 2 - label.getWidth() / 2;
		double n = y + RECT_HEIGHT / 2 + label.getAscent() / 2;
		add(label, m, n);

	}

	private void drawGraphicsProgramRectAndLabel() {
		double x = getWidth() / 2 - 3 * RECT_WIDTH / 2 - WIDTH_DIFFERENCE_BETWEEN_RECTS;
		double y = getHeight() / 2;
		GRect rect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(rect);
		GLabel label = new GLabel("GraphicsProgram");
		double m = x + RECT_WIDTH / 2 - label.getWidth() / 2;
		double n = y + RECT_HEIGHT / 2 + label.getAscent() / 2;
		add(label, m, n);
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
