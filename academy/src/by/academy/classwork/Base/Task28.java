package by.academy.classwork.Base;

public class Task28 {

	public static void main(String[] args) {

//		28. Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
//		через сколько лет его долг превысит s тысяч рублей,
//		если за это время он не будет отдавать долг.

		double m = 200_000;
		double dolg = 1_500_000;
		double time;

		for (double i = m; i <= dolg; i = i + m * 20 / 100) {

			System.out.println(i);
		}
	}
}
