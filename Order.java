package Lab3_Task2;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
	OrderItem[] items;

	public Order(OrderItem[] items) {
		super();
		this.items = items;
	}

	public double cost() {
		double result = 0.0;
		for (OrderItem orderItem : items) {
			result += orderItem.getPrice();
		}
		return result;
	}

	public boolean contains(Product p) {
		sortByID();
		System.out.println(Arrays.toString(items));
		return binarySearch(p, 0, items.length - 1);
	}

	public Product[] filter(String type) {
		sortByType();
		int len = 0;
		for (OrderItem orderItem : items) {
			if (orderItem.getP().getType().equals(type)) {
				len++;
			}
		}
		Product[] result = new Product[len];
		recursionType(type, 0, result, 0);
		return result;
	}

	public boolean binarySearch(Product p, int start, int end) {
		int mid = start + (end - start) / 2;
		if (end < start) {
			return false;
		}
		if (items[mid].compareTo(new OrderItem(p, 0)) == 0) {
			return true;
		}
		if (items[mid].compareTo(new OrderItem(p, 0)) > 0) {
			return binarySearch(p, start, --mid);
		} else {
			return binarySearch(p, ++mid, end);
		}
	}

	public void recursionType(String type, int index, Product[] result, int count) {
		if (index == items.length) {
			return;
		}
		if (items[index].getP().getType().equals(type)) {
			result[count++] = items[index].getP();
			recursionType(type, ++index, result, count);
		} else {
			recursionType(type, ++index, result, count);
		}
	}

	public void sortByName() {
		Arrays.sort(items, new Comparator<OrderItem>() {
			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public void sortByID() {
		Arrays.sort(items, new Comparator<OrderItem>() {
			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
	}

	public void sortByType() {
		Arrays.sort(items, new Comparator<OrderItem>() {
			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				return o1.compareByType(o2);
			}
		});
	}

	public static void main(String[] args) {
		Product p4 = new Product("04", "D", 150.0, "Other");
		Product p2 = new Product("02", "B", 200.0, "Ruler");
		Product p1 = new Product("01", "A", 100.0, "Pen");
		Product p3 = new Product("03", "C", 50.0, "Book");
		Product p5 = new Product("05", "G", 30.0, "Book");
		Product p6 = new Product("06", "D", 20.0, "Book");
		Product p7 = new Product("07", "F", 70.0, "Book");
		Product p8 = new Product("08", "T", 70.0, "Book");

		OrderItem o1 = new OrderItem(p1, 10);
		OrderItem o2 = new OrderItem(p2, 9);
		OrderItem o3 = new OrderItem(p3, 8);
		OrderItem o4 = new OrderItem(p4, 7);
		OrderItem o5 = new OrderItem(p6, 7);
		OrderItem o6 = new OrderItem(p5, 7);
		OrderItem o7 = new OrderItem(p7, 7);

		OrderItem[] listItems = new OrderItem[] { o7, o2, o4, o5, o1, o6, o3 };

		Order order = new Order(listItems);

		System.out.print("Test Cost: ");
		System.out.println(order.cost());

		System.out.print("Test Contain: ");
		System.out.println(order.contains(p8));

		System.out.println("Test Filter");
		System.out.println(Arrays.toString(order.filter("Book")));

	}

}