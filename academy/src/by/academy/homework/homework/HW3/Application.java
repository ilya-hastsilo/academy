package by.academy.homework.homework.HW3;

import by.academy.homework.homework.HW3.Product.*;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Seller seller = new Seller("Ignat", "+375291234567");
		Buyer buyer = new Buyer();

		Deal deal = new Deal();
		deal.inputDealDate();
		deal.addProduct(new Bread("Vodar", 100.0, "Belarus", 2));
		deal.addProduct(new Cheese("Poshehonskii", 150.0, "Ukraine", 1));
		deal.addProduct(new Wine("Cabernet Sauvignon", 350.0, "France", 1));

		Scanner scanner = new Scanner(System.in);
		buyer.inputDataBuyer();
		System.out.println("Введите сумму покупателя: ");
		buyer.setMoney(scanner.nextDouble());

		if (buyer.getMoney() - deal.totalSum() < 0) {
			System.out.println("Не хватает денег");
		} else {
			seller.showDataSeller();
			deal.deal();
			buyer.showDataBuyer();
			System.out.println("Остаток деньг покупателя: " + (buyer.getMoney() - deal.totalSum()));
		}
	}
}