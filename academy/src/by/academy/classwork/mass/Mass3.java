package by.academy.classwork.mass;

public class Mass3 {

	public static void main(String[] args) {
//		Задача 2.
//		Создайте массив из всех нечётных чисел от 1 до 99, 
//		выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
//		но в обратном порядке (99 97 95 93 … 7 5 3 1).

		int[] array = new int[50];
		int z = -1;
		for (int i = 0; i <= array.length - 1; i++) {
			if (i % 2 != 0) {
			}
			z += 2;
			array[i] = z;
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
