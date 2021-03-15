package by.academy.homework.homework.HW6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {

		try (BufferedReader bufread = new BufferedReader(new FileReader("Text.txt"));

				BufferedWriter result = new BufferedWriter(new FileWriter("RezultTasks.txt"))) {

			String textstart;
			textstart = bufread.readLine();

			File folder = new File("src/100txt");
			if (!folder.exists()) {
				folder.mkdir();
			}

			for (int i = 1; i <= 100; i++) {
				File file = new File(folder, i + ".txt");

				try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter(file))) {
					Random ran = new Random();
					String text;
					text = textstart.substring(ran.nextInt(textstart.length() + 1));
					bufwriter.write(text);

				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

				result.write(file.getName() + "-" + file.length() + "\n");
				result.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}