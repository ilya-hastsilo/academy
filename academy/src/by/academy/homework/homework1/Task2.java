
package by.academy.homework.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите тип данных: ");
		String d = sc.next();
		System.out.println("¬ведите переменную: ");
		String p = sc.next();

		switch (d) {
		case "int":
			double a = Double.parseDouble(p);
			System.out.println(a % 2);
			break;
		case "double":
			double s = Double.parseDouble(p);
			System.out.println(s / 100 * 70);
			break;
		case "float":
			float f = Float.parseFloat(p);
			System.out.println(f * f);
			break;
		case "char":
			System.out.print((int) sc.nextLine().charAt(0));
			break;
		case "String":
			System.out.println("Hello " + p);
			break;
		default:
			System.out.println("Unsupported type");
		}
		sc.close();
	}

}