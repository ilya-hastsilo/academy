package by.academy.classwork.Base;

import java.util.Arrays;

public class Task1000 {

	public static void main(String[] args) {

		String[] str = new String[1];
		str[0] = "привет";
//		str[1] = "пока";
//		str[2] = "как";
int num=0;
		
		
		
		for (int i = 0; i < str.length; i++) {
			if(i<str.length) {
				num=i+i;
				System.out.print(str[i]);

			}

//				System.out.print(str[i]);
			
		}
	}
}
