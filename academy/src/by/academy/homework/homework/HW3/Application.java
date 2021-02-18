package by.academy.homework.homework.HW3;

import java.text.ParseException;
import java.util.Scanner;

import by.academy.homework.homework.HW3.person.User;

public class Application {

	public static void main(String[] args) throws ParseException {
		Application application = new Application();
		application.runDeal();
	}

	private void runDeal() throws ParseException {
		Scanner sc = new Scanner(System.in);
		Deal deal = new Deal();
		System.out.println("seller's data");
		User user1 = new User();
		user1.readNewPerson();
		System.out.println("buyer's data");
		User user2 = new User();
		user2.readNewPerson();
		deal.setSeller(user1);
		deal.setBuyer(user2);
		deal.menuDeal(sc);
		if (deal.getProducts() != null && deal.getProducts()[0] != null) {
			System.out.println("The transaction was successful");
			System.out.println();
		} else {
			System.out.println("The transaction did not take place");
		}
		sc.close();
	}
}