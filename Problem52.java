import java.io.*;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram{

	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("Problem52.java"));
			while(true){
				String str = rd.readLine();
				if(str == null){
					break;
				}
				println(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
