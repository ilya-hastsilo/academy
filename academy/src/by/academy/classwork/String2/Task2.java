package by.academy.classwork.String2;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Task2 {

//	1. ����� � ������ �� ������ �������, �� � ������ ����� ����������. ����������
//	����� �� ����������

//	2. ������� ������ � �������. ���������� ���������� ���� � ������. ����������
//	������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����
//	������ ����� ����� ���� �������, �� ����� � �������������.

	public static void main(String[] args) {

		String text = " ������� ������ � �������. ���������� ���������� ���� � !������. ����������"
				+ "������, ��� ����� ����� ����������� ����������� ���������, � ������ � ����e"
				+ "������ ����� ����� ���� �������, �� ����� � �������������.?";
		String regex = "[\\.,!?;]";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);

		int counter = 0;
		while (m.find()) {
			counter++;
			System.out.print(text.substring(m.start(), m.end()));
		}
		System.out.println();
		System.out.println(counter);
	}

}
