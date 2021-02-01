package by.academy.classwork.mass;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
//		«адача 6.
//		—оздайте массив из 4 случайных целых чисел из отрезка [10;99], 
//		выведите его на экран в строку. ќпределить и вывести на экран сообщение о том, €вл€етс€ ли массив строго возрастающей последовательностью.

		int[] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 99) + 10;
		}
		System.out.println(Arrays.toString(array));
		boolean flag = true;
		for (int j = 1; j < array.length; j++) {
			if (array[j] <= array[j - 1]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("„исло €вл€етс€ строго возрастающей последовательностью!");
		} else {
			System.out.println("„исло не €вл€етс€ строго возрастающей последовательностью!");
		}
	}
}
