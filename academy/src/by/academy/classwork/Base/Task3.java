package by.academy.classwork.Base;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		3. Составьте программу, которая вычисляет произведение чисел от 1 до n.n вводится с клавиатуры.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
		int num = sc.nextInt();
		int proiz=1;
		for (int i = 1; i <= num; i++) {
			proiz*=i;
		}
		System.out.println(proiz);
		sc.close();
	}

}
