package by.academy.classwork.Base;

public class Task28 {

	public static void main(String[] args) {

//		28. ���������� ���� ����� m ����� ������ � ����� ��� 20% �������.
//		����� ������� ��� ��� ���� �������� s ����� ������,
//		���� �� ��� ����� �� �� ����� �������� ����.

		double m = 200_000;
		double dolg = 1_500_000;
		double time;

		for (double i = m; i <= dolg; i = i + m * 20 / 100) {

			System.out.println(i);
		}
	}
}
