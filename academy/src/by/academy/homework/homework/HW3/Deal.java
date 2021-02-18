package by.academy.homework.homework.HW3;

import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDate;
import by.academy.homework.homework.HW3.product.Wine;
import by.academy.homework.homework.HW3.person.Person;
import by.academy.homework.homework.HW3.product.Bread;
import by.academy.homework.homework.HW3.product.Cheese;
import by.academy.homework.homework.HW3.product.Product;

public class Deal implements Interface {

	public final static int MIN_PRODUCT = 2;

	Scanner sc = new Scanner(System.in);
	Person seller;
	Person buyer;
	Product[] products;
	String dealDate;
	int productCounter;
	public Double deal;
	private static final LocalDate date = LocalDate.now();
	private static final LocalDate deadLine = LocalDate.now().plusDays(10);

	public static final String MENU_DEAL = """
			The trade menu:
			1. Add Product
			2. Remove the product
			3. Display the information
			4. Make a deal
			0. Exit""";
	public static final String MENU_PRODUCT = """
			Product Menu:
			1. Add wine
			2. Add the cheese
			3. Add bread
			0. Exit""";

	public Deal() {
		super();
	}

	public Deal(Person seller, Person buyer, String dealDate) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.dealDate = dealDate;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[MIN_PRODUCT];
		} else {
			if ((productCounter + 1) > products.length) {
				expandProductArray();

			}
		}
		products[productCounter++] = product;
	}

	public void deleteProduct(String productName) {
		int x = -1;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				if (products[i].getName().equals(productName)) {
					x = i;
					break;
				}
			}
		}
		if (x == -1) {
			System.out.println("The product is missing");
		} else {
			System.arraycopy(products, x + 1, products, x, productCounter - x - 1);
			products[--productCounter] = null;
			System.out.println("Product removed");
		}
	}

	public Double deal() {
		Double Sum = 0.0;

		for (Product product : products) {
			if (product != null) {
				double x = product.getPrice() * product.getQuantity() * product.discount();

				if (product instanceof Wine) {
					System.out.print("Wine: ");
				} else if (product instanceof Cheese) {
					System.out.print("Cheese: ");
				} else if (product instanceof Bread) {
					System.out.print("Bread: ");
				}
				System.out.println(
						product.getPrice() + " * " + product.getQuantity() + " * " + product.discount() + " = " + x);
				Sum += x;
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Price including discount" + Sum);

		return Sum;
	}

	public void menuDeal(Scanner sc) {
		System.out.println(MENU_DEAL);
		String value = sc.nextLine();
		while (!value.equals("0")) {
			switch (value) {
			case "1": {
				menuProducts();
				System.out.println("----------------------------");
				System.out.println(MENU_DEAL);
				break;
			}
			case "2": {
				if (products != null && products[0] != null) {
					System.out.println("What to delete?");
					String productName = sc.nextLine();
					deleteProduct(productName);
				} else {
					System.out.println("Products are missing");
				}
				System.out.println("----------------------------");
				System.out.println(MENU_DEAL);
				break;
			}
			case "3": {
				deal();
				System.out.println("----------------------------");
				System.out.println(MENU_DEAL);
				break;
			}
			case "4": {
				if (products == null) {
					System.out.println("Products are missing");
					System.out.println("----------------------------");
					System.out.println(MENU_DEAL);
				} else {
					if (buyer.getMoney() >= deal()) {
						return;
					} else {
						System.out.println("Insufficient fundsв");
						System.out.println("----------------------------");
						System.out.println(MENU_DEAL);
					}
				}
				break;
			}
			default: {
				System.out.println("The value is incorrect");
			}
			}
			value = sc.nextLine();
		}
	}

	private void menuProducts() {
		System.out.println(MENU_PRODUCT);
		String value = sc.nextLine();
		while (!value.equals("0")) {
			switch (value) {
			case "1": {
				System.out.println("Вlead criteria of the product:");
				Wine Wine = new Wine();
				readProduct(Wine);
				System.out.println("Enter the grade");
				Wine.setSort(sc.nextLine());
				System.out.println("Enter the volume");
				Wine.setVolume(sc.nextDouble());
				System.out.println("Enter a color");
				Wine.setColor(sc.nextLine());
				sc.nextLine();
				addProduct(Wine);
				System.out.println("----------------------------");
				System.out.println(MENU_PRODUCT);
				break;
			}
			case "2": {
				System.out.println("Enter the criteria for the product: ");
				Cheese cheese = new Cheese();
				readProduct(cheese);
				System.out.println("Enter the weight of the");
				cheese.setMassa(sc.nextInt());
				System.out.println("Enter the brand:");
				cheese.setMade(sc.nextLine());
				sc.nextLine();
				addProduct(cheese);
				System.out.println("----------------------------");
				System.out.println(MENU_PRODUCT);
				break;
			}
			case "3": {
				System.out.println("Enter the criteria for the product:");
				Bread Bread = new Bread(value, deal, value, productCounter);
				readProduct(Bread);
				sc.nextLine();
				addProduct(Bread);
				System.out.println("----------------------------");
				System.out.println(MENU_PRODUCT);
				break;
			}
			default: {
				System.out.println("The value is incorrect ");
				System.out.println("----------------------------");
				System.out.println(MENU_PRODUCT);
			}
			}
			value = sc.nextLine();
		}
	}

	private void readProduct(Product product) {
		System.out.println("Enter the product name");
		product.setName(sc.nextLine());

		System.out.println("Enter the price");
		product.setPrice(sc.nextDouble());

		sc.nextLine();
		System.out.println("Enter the country of manufacture");
		product.setManufacture(sc.nextLine());

		System.out.println("Enter the quantity");
		product.setQuantity(sc.nextInt());
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

	public void setProduct(Product[] products) {
		this.products = products;
	}

	public String getDealDate() {
		return dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public LocalDate getDeadlineDate() {
		return deadLine;
	}

	public double getDeal() {
		return deal;
	}

	public void setPriceBill(Double deal) {
		this.deal = deal;
	}

	public String toString() {
		final StringBuilder sb = new StringBuilder("deal{");
		sb.append("seller - ").append(seller);
		sb.append(", buyer - ").append(buyer);
		sb.append(", products - ").append(Arrays.toString(products));
		sb.append(", the amount of the transaction - ").append(deal);
		sb.append(", transaction date - ").append(dealDate);
		sb.append(", transaction deadline - ").append(deadLine);
		sb.append('}');
		return sb.toString();
	}
}