package by.academy.homework.homework.HW7;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		List<Long> list = gen(100, 100);
		System.out.println(list.stream().map(value -> (value * Math.PI - 20)).filter(value -> value < 100).sorted()
				.skip(3).distinct().collect(Collectors.toMap(value -> value, value -> ("Number: " + value))));
	}

	private static List<Long> gen(int seed, int size) {
		return Stream.generate(() -> (long) new Random().nextInt(seed + 1)).limit(size).collect(Collectors.toList());
	}
}