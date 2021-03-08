package by.academy.homework.homework.HW5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String str = sc.nextLine();
		sc.close();

		Map<Character, Integer> map = new HashMap<>();
		char[] ch = str.replaceAll("\\s", "").toCharArray();

		for (Character symbol : ch) {
			if (!map.containsKey(symbol)) {
				map.put(symbol, 0);
			}
			map.put(symbol, map.get(symbol) + 1);
		}
		for (Character symbol : map.keySet()) {
			System.out.println("Symbol " + symbol + " : " + map.get(symbol));
		}
	}
}
