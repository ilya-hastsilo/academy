package by.academy.homework.homework.HW5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String[] args) {
		ArrayList<Integer> ratings = new ArrayList<>();
		Integer maxRating = 0;

		for (int i = 0; i < 10; i++) {
			Double d = (Math.random() * 10 + 1);
			ratings.add(d.intValue());
		}
		Iterator<Integer> iterator = ratings.iterator();
		while (iterator.hasNext()) {
			Integer m = iterator.next();
			if (maxRating < m) {
				maxRating = m;
			}
		}
		System.out.println("Ratings " + ratings);
		System.out.println("Max rating: " + maxRating);
	}
}