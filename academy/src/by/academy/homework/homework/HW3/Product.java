package by.academy.homework.homework.HW3;

public abstract class Product {
	protected String name;
	protected double price;
	protected String manufacture;
	protected int quantity;
	

	public Product() {
		super();
	}

	public Product(String name, Double price, String manufacture, Integer quantity) {
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	protected abstract double discount();

	protected double calcFinalPrice() {
		return price * quantity * discount();
	}
}