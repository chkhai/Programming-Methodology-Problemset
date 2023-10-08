import stanford.karel.SuperKarel;

public class Problem09 extends SuperKarel {
//კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
	
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			backUp();
		}
	}

	private void backUpToFirstRow() {
		
}

	private void backUp() {
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
	}
}
