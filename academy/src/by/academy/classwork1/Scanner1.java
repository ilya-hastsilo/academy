package by.academy.classwork1;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		String s = sc.nextLine();
//		System.out.println(s);

		System.out.println("������� ������ �����:");
		int i1 = sc.nextInt();
		System.out.println("������� ������ �����:");
		int i2 = sc.nextInt();
		System.out.println("����� " + i1 + " � " + i2 + " = " + (i1 + i2));

//		System.out.println("test".charAt(0));

		sc.close();
	}

}