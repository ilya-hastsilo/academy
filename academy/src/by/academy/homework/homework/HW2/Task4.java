package by.academy.homework.homework.HW2;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String[] style = { "Червы", "Бубны", "Пики", "Трефы" };
		String[] num = { "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10 ", "В  ", "Д  ", "К  ", "Т  " };
		int kart = 5, v = 0;
		String[] arr = new String[52];
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("Количество игроков:");
		int n = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num[i % num.length] + " " + style[i % style.length];
		}
		for (int i = 0; i < arr.length; i++) {
			int ram = rand.nextInt(52);
			String s = arr[i];
			arr[i] = arr[ram];
			arr[ram] = s;
		}
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < kart; i++) {
				System.out.println(arr[i + v]);
			}
			v += kart;
			System.out.println("\n" );
		}
		sc.close();
	}
}
