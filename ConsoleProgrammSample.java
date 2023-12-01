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
		String str = readLine("Enter string to tokenize");
		StringTokenizer tokenizer = new StringTokenizer(str, "l");	
		while(tokenizer.hasMoreTokens()){
			str = tokenizer.nextToken();
		}
		println(str);
	
	
	}

}
