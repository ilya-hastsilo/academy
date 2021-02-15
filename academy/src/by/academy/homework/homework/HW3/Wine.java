package by.academy.homework.homework.HW3;

public class Wine extends Product {

	public Wine(String name, Double price, String manufacture, Integer quantity) {
		super(name, price, manufacture, quantity);

	}

	@Override
	public double discount() {
		if (name.equals("Cabernet Sauvignon")) {
			return 0.83;
		}
		return 1.0;
	}

}