package by.academy.classwork.mass;

public class Task8 {

	public static void main(String[] args) {

//������ 7.
//�������� ������ �� 20-�� ������ ����� ��������� � �������� ��� �� �����. 
//����������, ��� ������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � ����� ���� ����������.

		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			if (i < 2) {
				array[i] = 1;
			} else {
				array[i] = array[i - 2] + array[i - 1];
			}
			System.out.println(array[i] + " ");
		}
	}
}
