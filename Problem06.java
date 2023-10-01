import stanford.karel.Karel;

public class Problem06 extends Karel {
	/*
	 * კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
	 */
	
	
	public void run(){
		while(noBeepersPresent()){
			move();
		}
		for(int i=0; i<7; i++){
			pickBeeper();
		}
		while(noBeepersPresent()){
			move();
		}
		for(int i=0; i<9; i++){
			pickBeeper();
		}
		move();
		for(int i=0; i<16; i++){
			putBeeper();
		}
		
	}
}
