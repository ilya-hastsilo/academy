package by.academy.classwork.mass;

import java.util.Random;

public class Mass2 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < array.length; i++) {
			int temp;
			for (int n = 0; n < array.length; n++) {
				if (array[i] > array[n]) {
					temp = array[i];
					array[i] = array[n];
					array[n] = temp;
				}
			}
		}
		System.out.println("\n");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
