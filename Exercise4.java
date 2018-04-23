package Buoi1;

import java.util.Scanner;

public class Exercise4 {
	private void Sapxep() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		double tem;
		double a[] = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextDouble();
		}
		System.out.println("The last digit is:");
		for (double i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("The numbers are arranged in ascending order:");

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tem = a[j];
					a[j] = a[i];
					a[i] = tem;
				}
			}
		}
		for (double j : a) {
			System.out.print(j + "\t");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		do {
			Exercise4 i4 = new Exercise4();
			i4.Sapxep();
			System.out.println("Select 1: continue, 2: end");
			i = s.nextInt();
		} while (i != 2);
	}

}
