package com.acm.problems;

import java.util.Scanner;

public class Problem_11150 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int input = sc.nextInt();

			if (input % 2 == 0) {
				input += input / 2;
			} else {
				input += (input - 1) / 2;
			}

			System.out.println(input);
		}

	}
}
