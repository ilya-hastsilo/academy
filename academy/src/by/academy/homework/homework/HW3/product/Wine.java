package by.academy.homework.homework.HW3.product;

public class Wine extends Product {
	private String sort;
	private String color;
	private Double volume;

	public Wine() {
		super();
	}

	public Wine(Double price, String name, String manufacture, Integer quantity, String sort, String color,
			Double volume) {
		super(name, price, manufacture, quantity);
		this.sort = sort;
		this.color = color;
		this.volume = volume;

	}

	@Override
	public double discount() {
		if (sort.equals("cherry") || color.equals("Red") || volume > 1.0) {
			return 0.83;
		} else {
			return 1;
		}
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String Sort) {
		this.sort = sort;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

}