package com.acm.problems;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem_10079 {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			BigInteger n = BigInteger.valueOf(sc.nextInt());

			if (n.compareTo(BigInteger.ZERO) < 0) {
				break;
			}

			
			n = n.multiply(n.add(BigInteger.valueOf(1)));
			n = n.divide(BigInteger.valueOf(2));
			n = n.add(BigInteger.ONE);

			System.out.println(n);

		}

	}

}
