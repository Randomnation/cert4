package m3topic4activities;

public class TwelveInts {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		for(int x = 0; x < numbers.length; ++x)
			System.out.print(numbers[x] + " ");
		System.out.println();
		
		for(int y = 12; y > 0; --y)
			System.out.print(numbers[y - 1] + " ");

	}

}
