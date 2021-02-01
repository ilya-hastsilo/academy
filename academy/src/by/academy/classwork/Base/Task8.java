package by.academy.classwork.Base;

public class Task8 {

	public static void main(String[] args) {
//		8. ƒаны натуральные числа от 20 до 50.Ќапечатать те из них, которые дел€тс€ на 3, но не дел€тс€ на 5

		for (int i = 20; i <= 50; i++) {
			if ((i % 3 == 0) && (i % 5 != 0)) {
				System.out.println(i);
			}
		}
	}
}
