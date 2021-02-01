package by.academy.classwork.mass;

import java.util.Arrays;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
//		Задача 3.
//		Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
//		Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
//		выведете это количество на экран на отдельной строке.

		int[] array = new int[15];
		Random rand = new Random();
		int v = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(9);
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++)
			if (array[i] % 2 == 0) {
				v++;
				System.out.println(array[i]);
			}
		System.out.println("В массиве чётных элементов: " + v);
	}
}