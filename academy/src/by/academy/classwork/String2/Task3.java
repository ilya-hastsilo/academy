package by.academy.classwork.String2;

public class Task3 {

//	2. ������� ������ � �������. ���������� ���������� ���� � ������. ����������
//	������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����
//	������ ����� ����� ���� �������, �� ����� � �������������.

	public static void main(String[] args) {

		String str = "	2. ������� ������ � �������. ���������� ���������� ���� � ������. ����������"
				+ "	������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����"
				+ "	������ ����� ����� ���� �������, �� ����� � �������������.";
		String[] array = str.split("\\s+");
		System.out.println(str.split("\\s+").length);
	}
}
