package com.acm.problems;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem_10220 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		while (sc.hasNext()) {
			
			int n = sc.nextInt();

			BigInteger result = BigInteger.ONE;

			for (int i = 1; i <= n; i++) {
				result = result.multiply(BigInteger.valueOf(i));
			}

			BigInteger output = BigInteger.ZERO;

			while (!result.equals(BigInteger.valueOf(0))) {
				output = output.add(result.mod(BigInteger.valueOf(10)));
				result = result.divide(BigInteger.valueOf(10));
			}

			System.out.println(output);

			
		}

	}
}
