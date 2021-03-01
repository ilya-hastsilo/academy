package by.academy.homework.homework.HW4.task3;

public class IteratorDemo {

	public static void main(String[] args) {
		Integer[][] array = { { 1, 2, 3, 4, 5, 6 }, { 5, 4, 3, 2, 1 } };
		ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);

		while (arrayIterator.hasNext()) {
			Integer i = arrayIterator.next();
			System.out.print(i+" ");
		}
	}
} 