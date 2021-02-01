package by.academy.homework.homework.HW1;

public class Task4 {

	public static void main(String[] args) {

		int num = 2;
		int mil = 1_000_000;

		for (int i = num; i < mil; i *= num) {
			System.out.println(i);
		}
	}
}
