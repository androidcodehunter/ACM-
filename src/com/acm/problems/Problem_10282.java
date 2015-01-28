package com.acm.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_10282 {

	public static void main(String[] args) {

		Map<String, String> countries = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);

		boolean firstLoop = true;

		while (sc.hasNext()) {

			String input = sc.nextLine();
			if (input.equals("")) {
				firstLoop = false;
				continue;
			}

			if (firstLoop) {
				String inputs[] = input.split("\\s++");
				countries.put(inputs[0], inputs[1]);
			}

			if (!firstLoop) {

				if (countries.containsValue(input)) {
					for (String key : countries.keySet()) {
						if (input.equals(countries.get(key))) {
							System.out.println(key);
						}
					}

				} else {
					System.out.println("eh");
				}
			}

		}

	}
}
