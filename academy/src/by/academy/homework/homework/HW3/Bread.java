package by.academy.homework.homework.HW3;

public class Bread extends Product {

	public Bread(String name, Double price, String manufacture, Integer quantity) {
		super(name, price, manufacture, quantity);

	}

	@Override
	public double discount() {
		if (name.equals("Vodar")) {
			return 0.8;
		}
		return 1.0;
	}

}
