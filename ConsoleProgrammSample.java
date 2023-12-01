/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import java.util.StringTokenizer;

import acm.program.*;
import acm.util.RandomGenerator;

//რა არის ალბათობა იმისა, რომ  6 გვერდიანი კამათლის 4-ჯერ გაგორების შედეგად ზედიზედ ამოვა 2 ცალი 2-იანი. 
//ამისათვის გააკეთეთ კამათლისა და გაგორებების სიმულაცია. ჩაატარეთ 10000 ცალი ექსპერიმენტი და დათვალეთ ხდომილების ალბათობა.
//ერთი ექსპერიმენტი არის კამათლის 4-ჯერ გაგორება. (Practice08)
//Tags: RandomGenerator, Simulations/Experiments , Probability, Dice


public class ConsoleProgrammSample extends ConsoleProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int TRIES = 1000;
	
	public void run() {
		String str = readLine("Enter string to tokenize: ");
		str = str.replace("mama", "luka");
		println(str);
//		StringTokenizer tokenizer = new StringTokenizer(str);
//		String m = "";
//		while(tokenizer.hasMoreTokens()){
//			m += tokenizer.nextToken();
//		}
//		println(m);
	
	
	}

}
