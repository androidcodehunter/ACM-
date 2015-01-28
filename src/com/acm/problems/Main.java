package com.acm.problems;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n = 360;
		
		int result = 0;
		
		int count = 0;
		while(n>0){
			result += n %10;
			n = n/10;
			
			if (n==0 && result !=9) {
				n = result;
				result = 0;
				count++;
			}
			
			if (n==0 && result ==9) {
				n = 0;
				count++;
			}
		}
		
		System.out.println(count);
	}
}
