package by.academy.classwork.mass;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
//		������ 6.
//		�������� ������ �� 4 ��������� ����� ����� �� ������� [10;99], 
//		�������� ��� �� ����� � ������. ���������� � ������� �� ����� ��������� � ���, �������� �� ������ ������ ������������ �������������������.

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
			System.out.println("����� �������� ������ ������������ �������������������!");
		} else {
			System.out.println("����� �� �������� ������ ������������ �������������������!");
		}
	}
}
