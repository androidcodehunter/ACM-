package com.acm.problems;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem_10922 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			BigInteger n = new BigInteger(sc.nextLine());
			BigInteger input = n;

			if (n.compareTo(BigInteger.ZERO) == 0) {
				break;
			}

			if (n.mod(BigInteger.valueOf(9)) != BigInteger.ZERO) {
				System.out.println(n + " is not a multiple of 9.");
				continue;
			}

			
			BigInteger result = BigInteger.ZERO;
			int count = 0;
			while (n.compareTo(BigInteger.ZERO) > 0) {
				result = result.add(n.mod(BigInteger.valueOf(10)));
				n = n.divide(BigInteger.valueOf(10));

				if (n.equals(BigInteger.ZERO) && !result.equals(BigInteger.valueOf(9))) {
					n = result;
					result = BigInteger.ZERO;
					count++;
				}
				
				if (n.equals(BigInteger.ZERO) && result.equals(BigInteger.valueOf(9))) {
					n = BigInteger.ZERO;
					count++;
				}
				
			}

			System.out.println(input + " is a multiple of 9 and has 9-degree "+count +".");

		}

	}
}
