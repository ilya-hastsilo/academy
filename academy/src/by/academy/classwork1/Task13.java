package by.academy.classwork1;

public class Task13 {

	public static void main(String[] args) {
//		12. Найти произведение двузначных нечетных чисел кратных 13.

		for (int i = 10; i < 100; i++) {
			if ((i % 2 != 0) || (i % 13 == 0)) {

				System.out.println(i);

			}
		}

	}

}
