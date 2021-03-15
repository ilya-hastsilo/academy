package by.academy.homework.homework.HW6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		try (FileReader reader = new FileReader("Text.txt")) {
			int ch;
			while ((ch = reader.read()) != -1) {
				if (' ' != ((char) ch)) {
					sb.append((char) ch);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		File file = new File("Result.txt");
		try (FileWriter writer = new FileWriter(file)) {
			file.createNewFile();
			writer.write(sb.toString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
