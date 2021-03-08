package by.academy.homework.homework.HW5;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		int[] array = new int[8];

		try {
			Random rand = new Random();
			for (int i = 0; i < 10; i++) {
				array[i] = rand.nextInt();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");
		}
	}
}
