package by.academy.classwork.String;

import java.util.Arrays;

import java.util.Scanner;

public class Task2 {

//	2. ¬вести n строк с консоли. ”пор€дочить и вывести строки в пор€дке возрастани€ (убывани€) 
//	значений их длины.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();

		}
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[i - 1]) {

			}

		}
		System.out.println(Arrays.toString(arr));

	}
}
