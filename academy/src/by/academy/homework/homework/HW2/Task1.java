package by.academy.homework.homework.HW2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите первую строку: ");
		String str = sc.nextLine();
		System.out.print("¬ведите вторую строку: ");
		String str2 = sc.nextLine();
		if (Strings(str, str2) == true) {
			System.out.println("–езультат: True");
		} else {
			System.out.println("–езультат: False");
		}
		sc.close();
	}

	public static boolean Strings(String str, String str2) {
		boolean result = true;
		int[] abc = new int[256];
		if (str.length() == str2.length()) {
			for (int i = 0; i < str.length(); i++) {
				char z = str.charAt(i);
				abc[z]++;
				int v = (int) str2.charAt(i);
				if (abc[v]-- <= 0) {
				}
			}
		} else {
			result = false;
		}
		return result;
	}
}