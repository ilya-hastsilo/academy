package by.academy.homework.homework.HW3;

import by.academy.homework.homework.HW3.DateValidator;

import java.time.LocalDate;
import java.util.Scanner;

public class Deal {

	public final static int DEFAULT_SIZE = 2;

	public String dealDate;
	private Person seller;
	private Person buyer;
	private Product[] products;
	private int productCounter;

	public Deal() {
		super();
	}

	public Deal(Person seller, Person buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public String getDealDate() {
		return dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[DEFAULT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	public double printBill() {
		System.out.println("Зарегистрирован " + dealDate);
		System.out.println("День: " + printDeadlineDate().getDayOfMonth());
		System.out.println("Месяц: " + printDeadlineDate().getMonth());
		System.out.println("Год: " + printDeadlineDate().getYear());
		double checkSum = 0.0;
		for (Product p : products) {
			if (p != null) {
				System.out.println("_________________");
				System.out.println("Продукт: " + p.getName());
				System.out.println(
						p.getPrice() + " x " + p.getQuantity() + " x " + p.discount() + " = " + p.calcFinalPrice());
				checkSum += p.calcFinalPrice();
			}
		}
		System.out.println("_________________");
		System.out.println("Общая сумма = " + checkSum);
		return checkSum;
	}

	public double totalSum() {
		double totalSum = 0.0;
		for (Product p : products) {
			if (p != null) {
				totalSum += p.calcFinalPrice();
			}
		}
		return totalSum;
	}

	public void deal() {
		System.out.println();
		System.out.println("Чек");
		printBill();
	}

	public void inputDealDate() {
		System.out.println("Дата ввода сделка (Формат dd/MM/yyyy)");
		Scanner sc = new Scanner(System.in);
		setDealDate(sc.nextLine());
		DateValidator dealDate = new DateValidator();
		dealDate.validate(this.dealDate);
	}

	public LocalDate printDeadlineDate() {
		LocalDate today = LocalDate.now();
		LocalDate deadlineDate = today.plusDays(10);
		return deadlineDate;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}
}