package by.academy.classwork.String2;

public class Task5 {

//	5. ���� ������:
//		" Hey      There!     How      Are you doing"   ;
//		�������� ���� 1 ������ ����� ����.

	public static void main(String[] args) {

		String str = " Hey      There!     How      Are you doing?";
		String[] array = str.split("[a-z]");
		System.out.println(str.replaceAll("\\s+", " ").trim());
	}

}
