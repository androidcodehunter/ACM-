package com.acm.problems;

public class Problem_11877 {
	public static void main(String[] args) {
		int n = 0;

		int bottolCount = 3;

		boolean isTrue = true;

		int c = n % bottolCount;

		int counter = 0;

		while (isTrue) {

			n = n / bottolCount;
			counter = counter + n;

			if (n == 0) {
				isTrue = false;
			}
			// count += n;
		}
		if (c >= 1) {
			System.out.println(counter + 1);
		} else {
			System.out.println(counter);
		}

	}
}
