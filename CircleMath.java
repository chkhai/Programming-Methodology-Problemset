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
	GOval o1;
	GOval o2;
	
	public void init() {
		for(int i=0; i < CIRCLE_NUM; i++){
			int x1 = rgen.nextInt(0, getWidth() - CIRCLE_D);
			int y1 = rgen.nextInt(0, getHeight() - CIRCLE_D);
			int x2 = rgen.nextInt(0, getWidth() - CIRCLE_D);
			int y2 = rgen.nextInt(0, getHeight() - CIRCLE_D);
			o1 = new GOval(CIRCLE_D, CIRCLE_D);
			o2 = new GOval(CIRCLE_D, CIRCLE_D);
			o1.setFilled(true);
			o2.setFilled(true);
			Color color = rgen.nextColor();
			o1.setColor(color);
			add(o1, x1, y1);
			o2.setColor(color);
			add(o2, x2, y2);
		}
	}
	
	public void run() {
		
	}
}
