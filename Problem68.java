import java.awt.event.ActionEvent;

import javax.swing.*;

import acm.program.GraphicsProgram;

//თქვენი ამოცანაა გრაფიკული პროგრამის საშუალებით გააკეთოთ ჩატი. ფანჯარაზე, SOUTH
//რეგიონზე უნდა გქონდეთ ერთი ტექსტფილდი და ერთი ღილაკი ტექტით Enter.
//ტექსტფილდში ტექსტის შეყვანის მერე Enter ჭილაკზე დაჭერით ტექსტი უნდა
//იწერებოდეს(იხატებოდეს) კანვასზე ხოლო ტექსტფილდში კი ტექსტი იშლებოდეს. ხელახლა
//ტექსტის შეყვანისას ახალი ტექსტი წინა ტექსტის ქვემოთ უნდა გამოცნდეს(როგორც ჩატში
//ხდება ხოლმე. თუკი ტექსტი ჩაცდება ეკრანს არაუშავს.

public class Problem68 extends GraphicsProgram{
	private JTextField field;
	private JButton button;
	
	public void init() {
		JTextField field = new JTextField(10);
		JButton button = new JButton("Enter: ");
		add(field, SOUTH);
		add(button, SOUTH);
		field.addActionListener(this);
		addActionListeners();
	}
	
	
	
	public void run() {
		
	}
	
	public void actionPerformed(ActionEvent e){
		println("here");
		if(e.getSource()==field){
			String text = field.getText();
			println(text);
			field.setText("");
		}
	}
}
