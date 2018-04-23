package Buoi1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out
					.println("Welcome to Execise! Please you select a function:");
			System.out.println("Select 0: Exit the system");
			System.out.println("Option 1: Solve the first order equation ");
			System.out.println("Select 2: Solve the quadratic equation ");
			System.out
					.println("Select 3: Enter a corresponding number of impressions in the week");
			System.out
					.println("Select 4: Enter any sequence of numbers then sort and display the series in ascending order");
			System.out
					.println("Select 5: To enter a zero in the display list from 0 to 10 (Enter greater than 0 and less than 10)");
			System.out
					.println("Select 6: To join the two of you directly. When one of you says goodbye, stop");
			System.out.println("Select 7: Join friends");

			System.out.println("n =");
			int n = sc.nextInt();
			switch (n) {
			case 0:
				System.out.println("GOODBYE!!!");
				System.exit(0);
				break;
			case 1:
				Exercise1 obj1 = new Exercise1();
				obj1.main(args);
				break;
			case 2:
				Exercise2 e2 = new Exercise2();
				e2.main(args);
				break;
			case 3:
				Exercise3 e3 = new Exercise3();
				e3.main(args);
				break;
			case 4:
				Exercise4 e4 = new Exercise4();
				e4.main(args);
				break;
			case 5:
				Exercise5 e5 = new Exercise5();
				e5.main(args);
				break;
			case 6:
				Exercise6 e6 = new Exercise6();
				e6.main(args);
				break;
			case 7:
				Exercise7 e7 = new Exercise7();
				e7.main(args);
				break;
			default:
				System.out.println("Please enter again!");
				break;
			}
			System.out.println();
		} while (true);
	}

}
