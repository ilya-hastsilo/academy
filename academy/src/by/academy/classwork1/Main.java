package by.academy.classwork1;

public class Main {

	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int m;
		int min, h;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		int hour = h % 24;
		System.out.println(hour + " ����� " + min + " ����� " + sec + " ������");

		int d = (h - hour) / 24;
		int day = h % 7;
		System.out.println(day + "�����");

		int w = (d - day) / 7;
		System.out.println(w + "������");
	}
}