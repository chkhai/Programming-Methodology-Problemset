import acm.program.ConsoleProgram;

//(2018 წლის გამოცდის ამოცანა)
//მატრიცას ეწოდება მაგიური თუკი ის კვადრატულია(n x n-ზე) და მასში არის ყველა
//რიცხვი 1-დან n^2-ის ჩათვლით. თქვენი მიზანია დაწეროთ magicMatrix მეთოდი
//რომელიც შეამოწმებს არის თუ არა მატრიცა მაგიური და თუკი მაგიურია მაშინ
//დააბრუნებს true-ს თუ არა მაშინ false-ს.

public class Problem58 extends ConsoleProgram{

	public void run() {
		
	}
	
	
	private boolean isMagicMatrix(int [][] matrix){
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] < 1 || matrix[i][j] > matrix.length * matrix.length){
					return false;
				}
				if(isNotFirstOccurence(i, j, matrix)){
					return false;
				}
			}
		}
		
		
		return true;
	}


	private boolean isNotFirstOccurence(int i, int j, int [][] matrix) {
		for(int k = 0; k < matrix.length; k++){
			for(int m = 0; m < matrix[i].length; m++){
				if(matrix[i][j]==matrix[k][m]){
					return false;
				}
			}
		}
		return true;
	}
	
}
