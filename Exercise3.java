package Buoi1;

import java.util.Scanner;

public class Exercise3 {
	private void Chonngay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("n =");
		int n = sc.nextInt();
		switch (n) {
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		case 8:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter again:");
			break;
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		do {
			Exercise3 i3 = new Exercise3();
			i3.Chonngay();
			System.out.println("Select 1: continue, 2: end");
			i = s.nextInt();
		} while (i != 2);
	}

}
