import acm.program.ConsoleProgram;

public class ExcelColumnNumber extends ConsoleProgram{

	public void run() {
		int columnNumber = readInt("Enter column number: ");
		String str = detectColumnName(columnNumber);
		println(str);
	}
	
	
	private String detectColumnName(int columnNumber){
		String str = "";

        while (columnNumber > 0) {
            
            int rem = (columnNumber - 1) % 26;

            char digit = (char) ('A' + rem);

            str = digit + str;

            columnNumber = (columnNumber - 1) / 26;
        }

        return str;
	}
	
}
