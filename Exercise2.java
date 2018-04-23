package Buoi1;

import java.util.Scanner;

public class Exercise2 {

	private void Giaiptb2() {
		double delta, x1, x2, x, a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a =");
		a = sc.nextDouble();
		System.out.println("Enter b =");
		b = sc.nextDouble();
		System.out.println("Enter c=");
		c = sc.nextDouble();
		if (a == 0) {
			if ((b != 0) && (c != 0)) {
				x = -c / b;
				System.out.println("Equation has the only solution is : " + x);
			} else if (c == 0) {
				System.out.println("The equation has countless solutions");
			} else {
				System.out.println("The equation has no solution");
			}
		} else {
			delta = ((b * b) - (4 * a * c));
			if (delta > 0) {
				x1 = ((-b + Math.sqrt(delta)) / (2 * a));
				x2 = ((-b - Math.sqrt(delta)) / (2 * a));
				System.out.println("The solution of the equation is: x1 = "
						+ x1);
				System.out.println("The solution of the equation is: x2 =  "
						+ x2);
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("The equation of dual solutions is: " + x);
			} else {
				System.out.println("The equation has no solution");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		do {
			Exercise2 i2 = new Exercise2();
			i2.Giaiptb2();
			System.out.println("Select 1: continue, 2: end");
			i = scan.nextInt();
		} while (i != 2);

	}

}