
/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	private static final int PAUSE_TIME = 5;
	
	private GOval BALL;
	
	private GRect PADDLE;
	
	private GRect BRICK;
	
	private double vx;
	
	private double vy;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		addMouseListeners();
		gameInitialization();
		playTheGame();
	}

	private void playTheGame() {
		waitForClick();
		vy = 3;
		vx = rgen.nextDouble(1.0 , 3.0);
		if(rgen.nextBoolean()){
			vx=-vx;
		}
		while(true){
			BALL.move(vx, vy);
			pause(PAUSE_TIME);
			if(BALL.getY() == 0 && BALL.getY() == HEIGHT - 2 * BALL_RADIUS){
				vy = -vy;
			}
			if(BALL.getX() == 0 && BALL.getX() == WIDTH- 2 * BALL_RADIUS){
				vx = -vx;
			}
		}
	}

	private void gameInitialization() {
		createBricks();
		createBall();
		createPaddle();
	}

	private void createPaddle() {
		PADDLE = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		PADDLE.setFilled(true);
		PADDLE.setLocation(WIDTH / 2 - PADDLE_WIDTH / 2, HEIGHT - PADDLE_HEIGHT - PADDLE_Y_OFFSET);
		add(PADDLE);
	}

	private void createBall() {
		BALL = new GOval(WIDTH / 2 - BALL_RADIUS, HEIGHT / 2 - BALL_RADIUS, 2 * BALL_RADIUS, 2 * BALL_RADIUS);
		BALL.setFilled(true);
		add(BALL);
	}

	private void createBricks() {
		for (int i = 1; i < NBRICK_ROWS + 1; i++) {
			createRow(i);
		}
	}

	private void createRow(int i) {
		double x = (WIDTH - NBRICKS_PER_ROW * BRICK_WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / 2;
		double y = BRICK_Y_OFFSET + (i - 1) * (BRICK_HEIGHT + BRICK_SEP);
		for (int j = 1; j < NBRICKS_PER_ROW + 1; j++) {
			BRICK = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
			Color color = checkColor(i);
			BRICK.setFilled(true);
			BRICK.setColor(color);
			add(BRICK);
			x = x + BRICK_WIDTH + BRICK_SEP;
		}
	}

	private Color checkColor(int i) {
		if (i <= NBRICK_ROWS / 5) {
			return Color.red;
		} else if (i <= NBRICK_ROWS * 2 / 5) {
			return Color.orange;
		} else if (i <= NBRICK_ROWS * 3 / 5) {
			return Color.yellow;
		} else if (i <= NBRICK_ROWS * 4 / 5) {
			return Color.green;
		} else {
			return Color.cyan;
		}
	}

}
