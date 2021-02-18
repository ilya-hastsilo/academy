package by.academy.homework.homework.HW3.person;

import by.academy.homework.homework.HW3.validator.BelarusPhone;
import by.academy.homework.homework.HW3.validator.DateValidator;
import by.academy.homework.homework.HW3.validator.EmailValidate;

import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;

public class User extends Person {
	private Date dateOfBirth;
	private String phoneNumber;
	private String email;
	private final static Pattern pattern = Pattern.compile("-");
	private final static DateValidator valDate = new DateValidator();
	private final static BelarusPhone valPhone = new BelarusPhone();
	private final static EmailValidate valEmail = new EmailValidate();
	private final static Scanner sc = new Scanner(System.in);

	public User() {
		super();
	}

	public User(String name, Double money, Date dateOfBirth, String phone, String email) {
		super(name, money);
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phone;
		this.email = email;
	}

	public void readNewPerson() throws ParseException {
		System.out.println("Enter a name");
		setName(sc.nextLine());

		System.out.println("Enter the amount of money");
		setMoney(sc.nextDouble());

		sc.nextLine();
		System.out.println("Enter your date of birth in the format dd/MM/yyyy или dd-MM-yyyy");
		String dateOfBirth = sc.nextLine();
		while (!valDate.validate(dateOfBirth)) {
			System.out.println("Invalid value");
			dateOfBirth = sc.nextLine();
		}
		setDateOfBirth(dateOfBirth);

		System.out.println("Enter your phone number");
		phoneNumber = sc.nextLine();
		while (!valPhone.validate(phoneNumber)) {
			System.out.println("Enter the phone number correctly");
			phoneNumber = sc.nextLine();
		}

		System.out.println("Enter your email address");
		email = sc.nextLine();
		while (!valEmail.validate(email)) {
			System.out.println("Invalid value");
			email = sc.nextLine();
		}
	}

	public void setDateOfBirth(String strDate) throws ParseException {
		Matcher matcher = pattern.matcher(strDate.trim());
		if (matcher.find()) {
			dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(strDate);
		} else {
			dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
		}
	}

	@SuppressWarnings("deprecation")
	public String getDateOfBirth() {
		return "день: " + dateOfBirth.getDate() + ", месяц: " + (dateOfBirth.getMonth() + 1) + ", год: "
				+ (dateOfBirth.getYear() + 1900);
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("Name - ").append(getName());
		sb.append(", money  - ").append(getMoney());
		sb.append(", date of birth - ").append(getDateOfBirth());
		sb.append(", phone number - ").append(phoneNumber);
		sb.append(", Email - ").append(email);
		sb.append('}');
		return sb.toString();
	}

}