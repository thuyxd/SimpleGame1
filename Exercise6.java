package Buoi1;

import java.util.Scanner;

public class Exercise6 {
	private void Hoithoai() {
		Scanner sc = new Scanner(System.in);
		String a = "";
		String b = "";
		System.out.println("Conversation:");
		do {
			System.out.println("A say :");
			a = sc.nextLine();
			if (a.equalsIgnoreCase("goodbye")) {
				System.out.println("The conversation ends");
				break;
			}
			System.out.println("B say :");
			b = sc.nextLine();
			if (b.equalsIgnoreCase("goodbye")) {
				System.out.println("The conversation ends");
				break;
			}
		} while (true);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		do {
			Exercise6 i6 = new Exercise6();
			i6.Hoithoai();
			System.out.println("Select 1: continue, 2: end");
			i = s.nextInt();
		} while (i != 2);
	}

}
