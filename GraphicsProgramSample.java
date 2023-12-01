import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

public class GraphicsProgramSample extends GraphicsProgram{

    private RandomGenerator rg = new RandomGenerator();
    private double d = 30;
    private double vx;
    private double vy;
    private GOval ball;
    private void randomVelocity(){
        // [1 ,2] or [-2, -1] <- vx, vy
        vx = rg.nextDouble(1,2);
        if(rg.nextBoolean()){
            vx= -1;
        }

        vy = rg.nextDouble(1, 2);
        if(rg.nextBoolean()){
            vy = -1;
        }
    }
    public void init(){
        addMouseListeners();
        ball = new GOval(d,d);
        ball.setFilled(true);
        ball.setFillColor(rg.nextColor());
        add(ball, rg.nextDouble(0, getWidth() - d), rg.nextDouble(0, getHeight() - d));
        randomVelocity();
    }
    public void checkBorders(){
        if(ball.getX() <= 0 || ball.getX() + d >= getWidth()){
            vx= -1;
        }
        if(ball.getY() <= 0 || ball.getY() + d >= getHeight()){
            vy *= -1;
        }
    }
    public void mousePressed(MouseEvent e){
        double x = e.getX() - d/2;
        double y = e.getY() - d/2;
        if(x >= getWidth() - d){
            x -= d/2;
        }
        if(x <= 0){
            x += d/2;
        }
        if(y >= getHeight() - d){
            y -= d/2;
        }
        if(y <= 0){
            y += d/2;
        }

        ball.setLocation(x,y);
        randomVelocity();
        // random color
        ball.setFillColor(rg.nextColor());
    }
    public void run(){

        while(true){
            ball.move(vx,vy);
            checkBorders();
            pause(15);
        }

    }
}