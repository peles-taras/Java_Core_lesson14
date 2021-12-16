package maximum;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Commodity c = new Commodity(null, 0, 0, 0);

		c.addSomething();

		while (true) {
			menu();
			switch (sc.next()) {

			case "1": {
				c.addCommodity();
				break;
			}
			case "2": {
				c.removeCommodity();

				break;
			}
			case "3": {
				c.replaceCommodity();
				break;
			}
			case "4": {
				c.sortByName();
				break;
			}
			case "5": {
				c.sortByLength();
				break;
			}
			case "6": {
				c.sortbyWidth();
				break;
			}
			case "7": {
				c.sortbyWeight();
				break;
			}
			case "8": {
				c.retrieveElement();
				break;
			}
			case "9": {
				System.out.println("Java Virtual Machine ��������");
				System.exit(0);

				break;
			}
			default:
				System.out.println("error");
			}
		}

	}

	public static void menu() {
		System.out.println("1 - ������ �����");
		System.out.println("2 - �������� �����");
		System.out.println("3 - ������� �����");
		System.out.println("4 - ��������� �� �������");
		System.out.println("5 - ��������� �� ��������");
		System.out.println("6 - ��������� �� �������");
		System.out.println("7 - ��������� �� �����");
		System.out.println("8 - �������� ������� � ��������");
		System.out.println("9 - ����� � ��������");
	}
}
