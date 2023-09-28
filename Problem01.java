import stanford.karel.Karel;
//კარელი დგას 1x1 უჯრაზე. 3x1 უჯრაზე დევს ბრილიანტი, კარელმა ბრილიანტი უნდა
//გადაიტანოს 4x1 უჯრაზე და დაამთავროს მუშაობა.
public class Problem01 extends Karel{
	
	/*
	 * pre: karel is at 1x1, facing east, beeper  at 3x1
	 * post: karel is at 4x1, facing east, beeper ar 4x1
	 */
	public void run (){
		move();
		move();
		pickBeeper();
		move();
		putBeeper();
	}
}
