import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	public void run(){
		
		GOval rugbyBall = new GOval(100, 200);
		
		add (rugbyBall, 100, 100);
		rugbyBall = new GOval(200, 200);
		add(rugbyBall, 200, 200);
		
		GOval oldBall = rugbyBall;
		
		add(rugbyBall);
		rugbyBall.setFilled(true);
		rugbyBall.setColor(Color.CYAN);
		
		oldBall.setFilled(true);
		oldBall.setColor(Color.PINK);
		
	}
}
