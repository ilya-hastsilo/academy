package by.academy.classwork.Base;

import java.util.Random;

public class Task18 {

	public static void main(String[] args) {
//		18. ������ ����������� ����� N. ����� ���������� ����������� �����, �� ������������� N � �� ��������� �� �� ���� �� ����� 2,3,5.

		Random rand = new Random();
		int ran = rand.nextInt(100);
		for (int i = 0; i <= ran; i++) {
			boolean v = i % 2 != 0 && i % 3 != 0 && i % 5 != 0;
			if (v) {
				System.out.print(i + " ");
			}
		}
	}
}
