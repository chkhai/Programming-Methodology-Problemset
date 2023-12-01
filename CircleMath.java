import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//დაწერეთ გრაფიკული თამაში, რომელიც გაშვებისთანავე დაამატებს CIRCLE_NUM
//წყვილ CIRCLE_D დიამეტრის მქონე წრეს. წყვილში ორივე წრე უნდა იყოს
//გაფერადებული ერთი და იმავე შემთხვევითი ფერით და თითოეულისთვის უნდა
//შეირჩეს ცალცალკე შემთხვევითი ლოკაცია.
//ამის შემდეგ პროგრამა იგივე პირობებით ყოველ DELAY მილიწამში ერთხელ ამატებს
//ახალ წყვილს, მანამ სანამ არ დასრულდება თამაში. თუ მომხმარებელი ერთმანეთის
//მიმდევრობით აკლიკებს ერთსა და იმავე ფერის წრეს, მაშინ ორივე წრე ქრება.
//გაითვალისწინეთ რომ წრეები ქრებიან მხოლოდ მაშინ როდესაც ერთმანეთის
//მიყოლებით ორ ერთსა და იმავე ფერის წრეს ვაკლიკავთ. ანუ ამ კლიკებს შორის არ
//უნდა მოხდეს კლიკი სხვა მესამე წრეზე ან ცარიელ ადგილზე. თამაში მთავრდება როცა
//ყველა წრე გაქრება დაფიდან. თამაშის დამთავრებისას პროგრამაც უნდა გაჩერდეს და
//აღარ დახატოს ახალი წრეები.

public class CircleMath extends GraphicsProgram{
	
	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 2;
	private final static int DELAY = 2000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	GOval o;
	int x1;
	int y1;
	int x2;
	int y2 ;
	Color color;
	
	public void init() {
		for(int i=0; i < CIRCLE_NUM; i++){
			x1 = rgen.nextInt(0, getWidth() - CIRCLE_D);
			y1 = rgen.nextInt(0, getHeight() - CIRCLE_D);
			x2 = rgen.nextInt(0, getWidth() - CIRCLE_D);
			y2 = rgen.nextInt(0, getHeight() - CIRCLE_D);
			o = new GOval(CIRCLE_D, CIRCLE_D);
			o.setFilled(true);
			color = rgen.nextColor();
			o.setColor(color);
			createTwoCircle();
		}
	}
	
	private void createTwoCircle() {
		add(o, x1, y1);
		add(o, x2, y2);
	}

	public void run() {
		addMouseListeners();
		while(true){
			
			
		}
	}
}
