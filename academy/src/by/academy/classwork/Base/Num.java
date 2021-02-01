package by.academy.classwork.Base;

public class Num {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;
		double s;
		if (a > b) {
			System.out.println("больше число а");
						System.out.println("меньшее число b");
		} else {
			System.out.println("больше число b");
			System.out.println("меньшее число а");
		}
		s = (a + b) / 2;
		System.out.println("среднее аремет чисел " + s);
	}
}
