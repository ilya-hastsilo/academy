package by.academy.homework.homework.HW6.Task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("Ilya1", "Ilya1", 18));
		users.add(new User("Ilya2", "Ilya2", 28));
		users.add(new User("Ilya3", "Ilya3", 38));
		users.add(new User("Ilya4", "Ilya4", 48));
		users.add(new User("Ilya5", "Ilya5", 58));
		users.add(new User("Ilya6", "Ilya6", 68));
		users.add(new User("Ilya7", "Ilya7", 78));
		users.add(new User("Ilya8", "Ilya8", 88));
		users.add(new User("Ilya9", "Ilya9", 98));
		users.add(new User("Ilya10", "Ilya10", 108));

		File folder = new File("users");
		if (!folder.exists()) {
			folder.mkdir();
		}
		for (User user : users) {
			String fileName = user.getName() + "_" + user.getSurname() + ".txt";
			File file = new File(folder, fileName);

			try (ObjectOutputStream objectStram = new ObjectOutputStream(new FileOutputStream(file))) {
				objectStram.writeObject(user);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
