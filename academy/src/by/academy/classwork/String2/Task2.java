package by.academy.classwork.String2;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Task2 {

//	1. Ќайти в строке не только зап€тые, но и другие знаки препинани€. ѕодсчитать
//	общее их количество

//	2. »меетс€ строка с текстом. ѕодсчитать количество слов в тексте. ∆елательно
//	учесть, что слова могут раздел€тьс€ несколькими пробелами, в начале и конце
//	текста также могут быть пробелы, но могут и отсутствовать.

	public static void main(String[] args) {

		String text = " »меетс€ строка с текстом. ѕодсчитать количество слов в !тексте. ∆елательно"
				+ "учесть, что слова могут раздел€тьс€ несколькими пробелами, в начале и концe"
				+ "текста также могут быть пробелы, но могут и отсутствовать.?";
		String regex = "[\\.,!?;]";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);

		int counter = 0;
		while (m.find()) {
			counter++;
			System.out.print(text.substring(m.start(), m.end()));
		}
		System.out.println();
		System.out.println(counter);
	}

}
