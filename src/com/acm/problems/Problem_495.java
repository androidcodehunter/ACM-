package com.acm.problems;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem_495 {

	public static void main(String[] args) {

		BigInteger results[] = new BigInteger[5001];
		results[0]= BigInteger.ZERO;
		results[1]= BigInteger.ONE;

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int n = sc.nextInt();

			for (int i = 2; i <= 5000; i++) {
					results[i]= results[i-1].add(results[i-2]);
			}

			System.out.println("The Fibonacci number for " + n + " is "
					+ results[n]);
		}

	}
}
