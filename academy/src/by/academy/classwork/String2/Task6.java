package by.academy.classwork.String2;

import java.util.regex.Pattern;

public class Task6 {

//	6. Написать regexp для email.

	static Pattern p =Pattern.compile("\\w+@\\w+\\.\\w+");

	public static void main(String[] args) {

		String s = "_123test@_123tes.__123tes";
		System.out.println(validate(s));

		s = s.trim();

		System.out.println();
	}

	private static boolean validate(String s) {

		s = s.trim();

		return p.matcher(s).mather();
	}

}
