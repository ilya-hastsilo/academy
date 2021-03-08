package by.academy.homework.homework.HW5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();

		num.add(77777);
		num.add(22222);
		num.add(22222);
		num.add(33333);
		num.add(77777);
		num.add(66666);
		num.add(77777);

		System.out.println(repeats(num));
	}

	static <T> HashSet<T> repeats(Collection<T> coll) {
		return new HashSet<>(coll);
	}
}
