package by.academy.homework.homework.HW3;

public class Cheese extends Product {

	public Cheese(String name, Double price, String manufacture, Integer quantity) {
		super(name, price, manufacture, quantity);

	}

	@Override
	public double discount() {
		if (name.equals("Poshehonskii")) {
			return 0.8;
		}
		return 1.0;
	}

}
