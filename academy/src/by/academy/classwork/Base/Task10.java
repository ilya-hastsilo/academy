package by.academy.classwork.Base;

public class Task10 {

	public static void main(String[] args) {
//		10. ���� ����������� ����� �� 1 �� 50. ����� ����� ��� �� ���, ������� ������� �� 5 ��� �� 7.

		int num = 0;
		for (int i = 1; i <= 50; i++) {
			if ((i % 5 == 0) || (i % 7 == 0)) {
				num += i;
			}
		}
		System.out.println(num);
	}
}
