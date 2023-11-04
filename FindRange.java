/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.ConsoleProgram;

public class FindRange extends ConsoleProgram {
	private static final int SENTINEL = 0;

	public void run() {
		println("This program finds smallest and largest numbers. ");
		int k = readInt("? ");
		int max = k;
		int min = k;
		while(true){
			int n = readInt("? ");
			if (n == SENTINEL){
				break;
			}
			max = compareMaxAndN(max, n);
			min = compareMinAndN(min, n);
		}
		println("largest: " + max);
		println("smallest: " + min);
	}
	/*
	 * This method helps us compare two integers. After comparing them, it keeps
	 * the track of the smallest one.
	 */
	private int compareMinAndN(int min, int n) {
		if (n < min) {
			min = n;
		}
		return min;
	}
	/*
	 *  This method helps us compare two integers. After comparing them, it keeps
	 * the track of the biggest one.
	 */
	private int compareMaxAndN(int max, int n) {
		if (n > max) {
			max = n;
		}
		return max;
	}
}