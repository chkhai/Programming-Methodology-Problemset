import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
//თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო.
public class Problem36 extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_EXPERIMENTS = 10000;
	public void run() {
		double sumFlips=0;
		for(int i = 0; i < NUM_EXPERIMENTS; i++) {
			int currFlips = holdExperiment();
			sumFlips = sumFlips + currFlips;
		} 
		double avgFlips = sumFlips / NUM_EXPERIMENTS;
		println(avgFlips);
	}
	private int holdExperiment() {
		int numFlips = 0;
		int threeInRow = 0;
		while(true){
			numFlips++;
			boolean isHeads = rgen.nextBoolean();
			if(isHeads){
				threeInRow++;
				if(threeInRow == 3){
					break;
				}
			}else{
				threeInRow=0;
			}
		}
		return numFlips;
	}
}
