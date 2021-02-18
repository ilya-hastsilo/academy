package by.academy.homework.homework.HW3.product;

public class Bread extends Product {

	public Bread(String name, Double price, String manufacture, Integer quantity) {
		super(name, price, manufacture, quantity);

	}

	@Override
	public double discount() {
		if (getQuantity() > 5) {
			return 0.9;
		}
		return 1.0;
	}

}
