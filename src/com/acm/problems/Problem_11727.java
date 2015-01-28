package com.acm.problems;

import java.util.Scanner;

public class Problem_11727 {

	public static void main(String[] args) {

		int max = 1000;
		int min = 10000;

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int n = Integer.parseInt(sc.nextLine());

			int result[] = new int[n];

			for (int i = 0; i < n; i++) {

				String results[] = sc.nextLine().split("\\s+");

				for (int j = 0; j < results.length; j++) {
					if (Integer.parseInt(results[j])>max) {
						max = Integer.parseInt(results[j]);
					}
					System.out.print(results[j]);
				}
			}
		}
		
		

	}
}
