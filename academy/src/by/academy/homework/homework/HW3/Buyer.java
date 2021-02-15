package by.academy.homework.homework.HW3;

import by.academy.homework.homework.HW3.BelarusPhone;
import by.academy.homework.homework.HW3.DateValidator;

import java.util.Scanner;

public class Buyer extends Person {

	public Buyer() {
		super();
	}

	public Buyer(String name, Double money) {
		super(name, money);
	}

	public Buyer(String name, String phone, String email, Double money, String dateOfBirth) {
		super(name, phone, email, money, dateOfBirth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void showDataBuyer() {
		System.out.println();
		System.out.println("Имя покупателя: Djons");
		System.out.println("Телефон покупателя:" + getPhone());
		System.out.println("_________________");
	}

	public void inputDataBuyer() {
		System.out.println();
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите телефон покупателя ");
		setPhone(sc.nextLine());
		BelarusPhone belarusPhoneValidator = new BelarusPhone();
		belarusPhoneValidator.validate(phone);

		System.out.println("Введите дату рождения покупателя ");
		setDateOfBirth(sc.nextLine());
		DateValidator dealDate = new DateValidator();
		dealDate.validate(dateOfBirth);
	}
}