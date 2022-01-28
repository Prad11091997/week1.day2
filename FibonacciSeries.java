package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 7;
		int f1 = 0;
		int f2 = 1;
		System.out.println(f1);
		System.out.println(f2);
		for (int i = 1; i < range; i++) {
			int f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
		}

	}

}
