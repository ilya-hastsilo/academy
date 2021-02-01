package by.academy.classwork.Base;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

//		2. —оставьте программу, которая вычисл€ет сумму чисел от 1 до n.значение n вводитс€ с клавиатуры.

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число: ");
		int num = sc.nextInt();
		int z = 0;
		for (int i = 0; i <= num; i++) {
			z += i;
		}
		System.out.println(z);
		sc.close();
	}
}
