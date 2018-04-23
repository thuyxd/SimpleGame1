package Buoi1;

import java.util.Scanner;

public class Exercise7 {
	private void Tgketban() {
		Scanner sc = new Scanner(System.in);
		String name, h, g;
		int t;
		String value = "";
		System.out.println("Enter name :");
		name = sc.nextLine();
		System.out.println("Enter age :");
		t = Integer.parseInt(sc.nextLine());
		System.out.println("Marital Status: Not married or divorced");
		h = sc.nextLine();
		System.out.println("Male OR Female");
		g = sc.nextLine();
		g.equalsIgnoreCase("");
		if (t < 18) {
			System.out.println("Do not participate in making friends");
		} else {
			switch (g) {
			case "male": {
				value = ((t >= 22) && ((h.equalsIgnoreCase("not married") || (h
						.equalsIgnoreCase("not married"))))) ? "Get involved in making friends"
						: "Do not participate in making friends";
				System.out.println(value);
				break;
			}
			case "female":
				value = (((h.equalsIgnoreCase("not married") || (h
						.equalsIgnoreCase("not married"))))) ? "Get involved in making friends"
						: "Do not participate in making friends";
				System.out.println(value);
				break;
			default:
				System.out.println("Please enter again:");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		do {
			Exercise7 i7 = new Exercise7();
			i7.Tgketban();
			System.out.println("Select 1: continue, 2: end");
			i = s.nextInt();
		} while (i != 2);

	}
}
