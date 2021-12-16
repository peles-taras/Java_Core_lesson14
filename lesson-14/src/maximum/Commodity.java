package maximum;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Commodity {
	private String name;
	private int legth;
	private int width;
	private int weight;
	Scanner sc = new Scanner(System.in);

	TreeSet<Commodity> ts = new TreeSet<>(new ComparatorName());

	public Commodity(String name, int legth, int width, int weight) {
		this.name = name;
		this.legth = legth;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegth() {
		return legth;
	}

	public void setLegth(int legth) {
		this.legth = legth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity �����: " + name + ", �������: " + legth + ", ������: " + width + ", ����: " + weight + "";
	}

	public void addSomething() {
		ts.add(new Commodity("name1", 99, 55, 31));
		ts.add(new Commodity("name2", 105, 204, 29));
		ts.add(new Commodity("name3", 202, 301, 44));
		ts.add(new Commodity("name4", 34, 98, 39));
		ts.add(new Commodity("name5", 5, 155, 19));
	}

	public void addCommodity() {
		System.out.println("������� ������� ��� �� ����:\n����� ������(String), �������, ������, ����");
		ts.add(new Commodity(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		for (Commodity commodity : ts) {
			System.out.println(commodity.toString());
		}
	}

	public void removeCommodity() {
		System.out.println("������ ����� ������ ��� ���������:");

		ts.remove(new Commodity(sc.next(), 0, 0, 0));

		for (Commodity commodity : ts) {
			System.out.println(commodity.toString());
		}
	}

	public void replaceCommodity() {
		for (Commodity commodity : ts) {
			System.out.println(commodity.toString());
		}
		System.out.println("������ ����� ������ ���� �������:");

		ts.remove(new Commodity(sc.next(), 0, 0, 0));

		System.out.println(
				"�� ���� ������� ��� ������, �� ���� ��������:\n����� ������(String), �������, ������, ����");
		ts.add(new Commodity(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		System.out.println("����� ������");
	}

	@SuppressWarnings("unused")
	public void retrieveElement() {
		Iterator<Commodity> iterator = ts.iterator();
		int count = -1;

		while (iterator.hasNext()) {
			count++;
			System.out.println(iterator.next() + ", ������: " + count);
		}
		System.out.println("������ ������ �������� ��� ������:");
		int n = ts.size();
		Commodity array[] = new Commodity[n];
		array = ts.toArray(array);
		System.out.println(array[sc.nextInt()]);
	}

	public void sortByName() {
		for (Commodity commodity : ts) {
			System.out.println(commodity.toString());
		}
	}

	@SuppressWarnings("unchecked")
	public void sortByLength() {
		Object abcd = ts.clone();
		TreeSet<Commodity> ts = new TreeSet<>(new ComparatorLength());
		ts.addAll((Collection<? extends Commodity>) abcd);
		for (Commodity commodity : ts) {
			System.out.println(commodity.toString());
		}
	}

	@SuppressWarnings("unchecked")
	public void sortbyWidth() {
		Object abcd = ts.clone();
		TreeSet<Commodity> ts = new TreeSet<>(new ComparatorWidth());
		ts.addAll((Collection<? extends Commodity>) abcd);
		for (Commodity commodity : ts) {
			System.out.println(commodity.toString());
		}
	}

	@SuppressWarnings("unchecked")
	public void sortbyWeight() {
		Object abcd = ts.clone();
		TreeSet<Commodity> ts = new TreeSet<>(new ComparatorWeight());
		ts.addAll((Collection<? extends Commodity>) abcd);
		for (Commodity commodity : ts) {
			System.out.println(commodity.toString());
		}
	}

}
