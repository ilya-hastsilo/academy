package by.academy.classwork.mass;

import java.util.Arrays;

public class Mass1 {

//	������ 1. �������� ������ �� ���� ������ ����� �� 2 �� 20 � �������� �������� ������� �� ����� ������� � ������, 
//	������� ���� ������� �� ������� ��������, � ����� � ������� (������� ���� ������� �� ������� ������� ����� ������). 
//	����� ��������� ������� ���������, ������ �� ����� �������.
//	2 4 6 � 18 20
//	2
//	4
//	6
//	�
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
