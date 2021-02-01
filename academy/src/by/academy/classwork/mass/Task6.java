package by.academy.classwork.mass;

import java.util.Arrays;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
//		Задача 5.
//		Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, 
//		выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, 
//		для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

		int[] array = new int[5];
		int sum = 0;
		int sum2 = 0;
		int d = 0;
		int d2 = 0;
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(5);
			sum += array[i];
			d = sum / 5;
		}
		System.out.println("Массив 1 : " + Arrays.toString(array));
		System.out.println("\n");

		int[] array2 = new int[5];
		Random rand2 = new Random();
		for (int j = 0; j < array2.length; j++) {
			array2[j] = rand2.nextInt(5);
			sum2 += array2[j];
			d2 = sum2 / 5;
		}
		System.out.println("Массив 2 : " + Arrays.toString(array2));
		System.out.println("\n");
		if (d > d2) {
			System.out.println("Массив 1 больше!");
		} else if (d < d2) {
			System.out.println("Массив 2 больше!");
		} else if (d == d2) {
			System.out.println("Массивы равны!");
		}
	}
}