package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����: ");
		Double s = sc.nextDouble();
		System.out.println("������� �������: ");
		Double v = sc.nextDouble();
		if (s < 100) {
			System.out.println("���� ����� ��������� 5% � ������ " + (s - (s / 100 * 5)));
		} else if ((s <= 100) || (s < 200)) {
			System.out.println("���� ����� ��������� 7% � ������ " + (s - (s / 100 * 7)));
		} else if ((s <= 200) || (s < 300) || (v > 18)) {
			System.out.println("���� ����� ��������� 16% � ������ " + (s - (s / 100 * 16)));
		} else if ((s <= 200) || (s < 300)) {
			System.out.println("���� ����� ��������� 9% � ������ " + (s - (s / 100 * 9)));
		} else if ((s <= 300) || (s < 400)) {
			System.out.println("���� ����� ��������� 15% � ������ " + (s - (s / 100 * 15)));
		} else if (s >= 400) {
			System.out.println("���� ����� ��������� 20% � ������ " + (s - (s / 100 * 20)));
		}
		sc.close();
	}
}
