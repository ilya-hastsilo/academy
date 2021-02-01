package by.academy.homework.homework.HW2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;

		System.out.println("Введите количество слов: ");
		int num = 0;
		num = sc.nextInt();

		if (num < 1) {
			System.out.println("Некорректный ввод!");
			return;
		}
		String[] arr = new String[num];
		int[] s = new int[num];
		System.out.println("Введите слово:");

		for (int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			s[i] = arr[i].length();
			for (int j = 0; j < arr[i].length(); j++) {
				if (j != arr[i].indexOf(arr[i].charAt(j))) {
					s[i]--;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i] < s[res])
				res = i;
		}
		System.out.println("Минимальное количество различных символов, в строке: " + "\n" + arr[res]);
	}
}
