package by.academy.classwork1;

public class Task6 {

	public static void main(String[] args) {
//		6. � ��������� �� ������������� ����� �������� S ������.����� ������ ����� ������ ����� N ���.
		double summ = 1000;
		int perenc = 3;
		int year = 5;

		for (int i = 0; i < year; i++) {
			summ += (summ * perenc * 0.01);

		}
		System.out.println(summ);
	}

}
