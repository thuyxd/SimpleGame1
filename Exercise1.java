package Buoi1;

import java.util.Scanner;

public class Exercise1 {

	private void GiaiPTB1() {
		double x, a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a = ");
		a = sc.nextDouble();
		System.out.println("Enter  b =");
		b = sc.nextDouble();
		if (a == 0) {
			if (b == 0) {
				System.out.println("The equation has countless solutions");
			} else {
				System.out.println("The equation has no solution");
			}
		} else {
			x = -b / a;
			System.out.println("The equation has the solution: " + x);
		}
	}

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		do {
			Exercise1 i1 = new Exercise1();
			i1.GiaiPTB1();
			System.out.println("Choose 1 to continue, 2 to end");
			i = scan.nextInt();

		} while (i != 2);

	}
}
