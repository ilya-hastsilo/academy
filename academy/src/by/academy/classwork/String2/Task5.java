package by.academy.classwork.String2;

public class Task5 {

//	5. ƒана строка:
//		" Hey      There!     How      Are you doing"   ;
//		оставить лишь 1 пробел между слов.

	public static void main(String[] args) {

		String str = " Hey      There!     How      Are you doing?";
		String[] array = str.split("[a-z]");
		System.out.println(str.replaceAll("\\s+", " ").trim());
	}

}
