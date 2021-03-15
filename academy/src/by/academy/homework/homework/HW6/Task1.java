package by.academy.homework.homework.HW6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		File file = new File("text.txt");
		file.createNewFile();
		String text = "";

		try (FileWriter writer = new FileWriter(file)) {
			boolean repeat = true;

			do {
				text = sc.next();
				if (!"stop".equals(text)) {
					writer.write(text);
					writer.append("\n");
				} else {
					repeat = false;
				}
			} while (repeat);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}