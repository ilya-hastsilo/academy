package by.academy.classwork.Base;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

//		2. ��������� ���������, ������� ��������� ����� ����� �� 1 �� n.�������� n �������� � ����������.

		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����: ");
		int num = sc.nextInt();
		int z = 0;
		for (int i = 0; i <= num; i++) {
			z += i;
		}
		System.out.println(z);
		sc.close();
	}
}
