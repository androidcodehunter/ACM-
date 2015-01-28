package com.acm.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_11233 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] inputs = sc.nextLine().split("\\s+");

		Map<String, String> words = new HashMap<String, String>();

		for (int i = 0; i < Integer.parseInt(inputs[0]); i++) {
			String values[] = sc.nextLine().split("\\s+");
			words.put(values[0], values[1]);
		}

		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < Integer.parseInt(inputs[1]); i++) {
			String word = sc.nextLine();
			
			if (words.get(word)!=null) {
				buffer.append(words.get(word)+" ");
			}else if(word.endsWith("y")& "aeiou".indexOf(word.charAt(word.length()-2)) < 0){
					buffer.append(word.subSequence(0, word.indexOf("y"))+ "ies"+" ");
			}else if(word.endsWith("o")||word.endsWith("s")||word.endsWith("ch")||word.endsWith("sh")||word.endsWith("x")){
				buffer.append(word+"es"+" ");
			} 
			
			else{
				buffer.append(word+"s"+" ");
			}
			
		}
		
		String r[]= buffer.toString().split(" ");
		
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}

	}

}
