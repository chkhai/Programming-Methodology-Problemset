import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

//ტეხილის სათავე დაფიქსირებულია და მდებარეობს (0,0) წერტილში.მაუსის
//ყოველ კლიკზე დაფაზე უნდა დაემატოს ახალი GLine რომლის ერთი წვერო არის
//ტეხილის ბოლო წერტილი, ხოლო მეორე წვერო კი, წერტილი სადაც მოხდა მაუსის
//კლიკი. მაგალითად თუ მომხმარებელმა პირველად დააკლიკა (10, 100) წერტილზე, მაშინ თქვენმა პროგრამამ დაფაზე უნდა დაამატოს (0, 0) წერტილიდან (10, 100)
//წერტილამდე მონაკვეთი. ხოლო თუ მეორე დაჭერისას მომხმარებელმა
//დააკლიკა (5, 5) წერტილზე, დაფაზე უნდა დაემატოს (10, 100) წერტილიდან (5, 5)
//წერტილამდე მონაკვეთი. ყოველი მაუსის გაჩოჩებისას(mouseDragged) პროგრამა უნდა ხატავდეს
//მონაკვეთის მოძრაობას, რომლის ერთი ბოლო დაფიქსირებულია ტეხილის ბოლო
//წერტილში, ხოლო მეორე ბოლო დაყვება მაუსის ისარს. ისევე როგორც ეს ხდება
//პროგრამაში Paint. ამოხსნა დაწერეთ zigzag.java

public class Zigzag extends GraphicsProgram{
	
	private double x1=0;
	private double y1=0;
	private double x2;
	private double y2;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		x2 = e.getX();
		y2 = e.getY();
		x2=x1;
		y2=y1;
	}
	
	public void mouseDragged(MouseEvent e){
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}
}
