package by.academy.classwork.mass;

import java.util.Arrays;

public class Mass1 {

//	«адача 1. —оздайте массив из всех чЄтных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
//	отдел€€ один элемент от другого пробелом, а затем в столбик (отдел€€ один элемент от другого началом новой строки). 
//	ѕеред созданием массива подумайте, какого он будет размера.
//	2 4 6 Е 18 20
//	2
//	4
//	6
//	Е
//	20

	public static void main(String[] args) {
		int[] array = new int[10];
		int v = 0;
		for (int i = 0; i < array.length; i++) {
			v += 2;
			array[i] = v;
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print("\n" + array[i]);
		}
	}
}
