package by.academy.homework.homework.HW3;

public class Bread extends Product {
//	private String country;

	public Bread(String name, Double price, String manufacture, Integer quantity) {
		super(name, price, manufacture, quantity);
//		this.country = country;

	}

	@Override
	public double discount() {
		if (name.equals("Vodar")) {
			return 0.8;
		}
		return 1.0;
	}

//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
}
