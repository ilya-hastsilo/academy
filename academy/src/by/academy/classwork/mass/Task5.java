package by.academy.classwork.mass;

import java.util.Random;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
//		������ 4.
//		�������� ������ �� 8 ��������� ����� ����� �� ������� [1;10]. �������� ������ �� ����� � ������. 
//		�������� ������ ������� � �������� �������� �� ����. ����� �������� ������ �� ����� �� ��������� ������.

		int[] array = new int[8];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(array));

		for (int j = 0; j < array.length; j++) {
			if (j % 2 == 1) {
				array[j] = 0;
			}
		}
		System.out.println("\n");
		System.out.println(Arrays.toString(array));
	}
}
