import stanford.karel.Karel;

public class Problem07 extends Karel {
	/*კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
	 */
	
	
	public void run(){
		while(leftIsClear()){
			while(frontIsClear()){
				placeBeepers();
			}
			if(noBeepersPresent()){
				putBeeper();
			}
			if(leftIsClear()){
				ascend();
			}
		}
	}
	
	
	
	private void placeBeepers(){
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
	}
	
	private void ascend(){
		if(facingEast()){
			turnLeft();
			move();
			turnLeft();
		}else{
			turnRight();
			move();
			turnRight();
		}
	}
	
	
	private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	
	
	
	
	
	
	
	
}