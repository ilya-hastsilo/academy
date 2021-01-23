package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму: ");
		Double s = sc.nextDouble();
		System.out.println("Введите возраст: ");
		Double v = sc.nextDouble();
		if (s < 100) {
			System.out.println("Ваша скида составила 5% к оплате " + (s - (s / 100 * 5)));
		} else if ((s <= 100) || (s < 200)) {
			System.out.println("Ваша скида составила 7% к оплате " + (s - (s / 100 * 7)));
		} else if ((s <= 200) || (s < 300) || (v > 18)) {
			System.out.println("Ваша скида составила 16% к оплате " + (s - (s / 100 * 16)));
		} else if ((s <= 200) || (s < 300)) {
			System.out.println("Ваша скида составила 9% к оплате " + (s - (s / 100 * 9)));
		} else if ((s <= 300) || (s < 400)) {
			System.out.println("Ваша скида составила 15% к оплате " + (s - (s / 100 * 15)));
		} else if (s >= 400) {
			System.out.println("Ваша скида составила 20% к оплате " + (s - (s / 100 * 20)));
		}
		sc.close();
	}
}
