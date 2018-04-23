package Buoi1;

import java.util.Scanner;

public class Exercise5 {

	private void Nhapso() {
		Scanner sc = new Scanner(System.in);
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int x;
		System.out.println("Enter in any number:");
		x = sc.nextInt();
		for (int j : a) {
			if (j == x) {
				continue;
			} else {
				System.out.print(j);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		do {
			Exercise5 i5 = new Exercise5();
			i5.Nhapso();
			System.out.println("Select 1: continue, 2: end");
			i = s.nextInt();
		} while (i != 2);
	}
}
