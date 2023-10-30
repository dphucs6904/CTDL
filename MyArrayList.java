package Task1;

import java.util.Arrays;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
		this.size = 0;
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
		this.size = 0;
	}

	private void growSize() {
		if (size == elements.length) {
			int newCapacity = elements.length * 2;
			elements = Arrays.copyOf(elements, newCapacity);
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E get(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return elements[i];
	}

	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		E oldValue = elements[i];
		elements[i] = e;
		return oldValue;
	}

	public boolean add(E e) {
		growSize();
		elements[size] = e;
		size++;
		return true;
	}

	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i > size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		growSize();
		for (int j = size; j > i; j--) {
			elements[j] = elements[j - 1];
		}
		elements[i] = e;
		size++;
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		E removedElement = elements[i];
		for (int j = i; j < size - 1; j++) {
			elements[j] = elements[j + 1];
		}
		elements[size - 1] = null;
		size--;
		return removedElement;
	}
	public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("Danh sách ban đầu:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        myList.set(1, 10);
        System.out.println("Danh sách sau khi thay đổi:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        myList.remove(0);
        System.out.println("Danh sách sau khi xóa:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
