package by.academy.classwork.Base;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		3. ��������� ���������, ������� ��������� ������������ ����� �� 1 �� n.n �������� � ����������.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����: ");
		int num = sc.nextInt();
		int proiz=1;
		for (int i = 1; i <= num; i++) {
			proiz*=i;
		}
		System.out.println(proiz);
		sc.close();
	}

}
