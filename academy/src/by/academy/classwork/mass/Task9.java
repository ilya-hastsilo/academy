package by.academy.classwork.mass;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
//		������ 8.
//		�������� ������ �� 12 ��������� ����� ����� �� ������� [-15;15]. 
//		���������� ����� ������� �������� � ���� ������� ������������ � �������� ������ ��� ���������� ��������� � ������.

		int array[] = new int[12];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 31) - 15;
			System.out.print(array[i] + " ");
		}
		int max = array[0], index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
				index = i;
			}
		}
		System.out.println("\n");
		System.out.println("����� ������� �����: " + max + "  ������: " + index);
	}
}
