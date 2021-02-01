package by.academy.classwork.Base;

public class Task12 {

	public static void main(String[] args) {
//		12. Найти произведение двузначных нечетных чисел кратных 13.

		int num = 10;
		for (int i = 10; i <= 100; i++) {
			if ((i % 2 != 0) && (i % 13 == 0)) {
				num *= i;
			}
		}
		System.out.println(num);
	}
}
