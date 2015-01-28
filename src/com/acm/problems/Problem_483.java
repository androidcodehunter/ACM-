package com.acm.problems;

import java.util.Scanner;

public class Problem_483 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {

			String input = sc.nextLine();
			
			String results[] = input.split("\\s+");
			
			for (int i = 0; i < results.length; i++) {		
				System.out.print(new StringBuffer(results[i]).reverse());
				if (i!=results.length-1) {
					System.out.print(" ");
				}
			}		
			System.out.println();
		}
		sc.close();
		
	}
}
