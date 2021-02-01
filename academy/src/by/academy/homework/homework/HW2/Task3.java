package by.academy.homework.homework.HW2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 2 слова, состоящие из четного количества букв: ");
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		if (str.length() % 2 != 0 || str2.length() % 2 != 0) {
			System.out.println("Некорректный ввод! ");
			return;
		}
		String result = str.substring(0, str.length() / 2) + str2.substring(str2.length() / 2, str2.length());
		System.out.println(result);
	}
}
