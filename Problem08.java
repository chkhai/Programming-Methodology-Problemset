import stanford.karel.SuperKarel;

public class Problem08 extends SuperKarel {
	//კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
	//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
	//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.
	
	
	public void run(){
		subtract();
		placeBeepers();
	}
	
	
	private void placeBeepers(){
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}

	private void subtract(){
		move();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			pickBeeper();
			turnAround();
			move();		
		}
		turnAround();
		move();
		turnAround();
	}
}
