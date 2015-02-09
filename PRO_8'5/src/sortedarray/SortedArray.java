package sortedarray;

public class SortedArray<T> {
	int[] array;
	int numElements;
	static int size;

	public SortedArray(int n) {
		this.size = n;
		array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = -1;
		}
		this.numElements = 0;
	}

	public void put2(int num) {
		int index = numElements - 1;
		while ((index >= 0) && (num < array[index])) {
			array[index + 1] = array[index];
			index--;
		}
		array[index + 1] = num;
		numElements++;

	}

	public void put(int num) {
		int temp;
		int position = 0;
		while ((num > array[position]) && (position < numElements)) {
			position++;
		}
		for (int i = position; i < array.length; i++) {
			temp = array[i];
			array[i] = num;
			num = temp;
		}
		numElements++;
	}

	public static int getSize() {
		return size;
	}

	public boolean isEmpty() {
		boolean empty = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1)
				empty = true;
		}
		return empty;
	}

	public boolean isFull() {
		boolean full = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1) {
				full = false;
			}
		}
		return full;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < array.length; i++) {
			s = s + array[i] + ",  ";
		}
		s += "\n" + "Num de elementos: " + numElements;
		return s;
	}

	public int getElementAt(int index) {
		return array[index];
	}

	public void removeElementAt(int index) {
		int temp = 0;
		array[index] = -1;
		for (int i = index; i < numElements - 1; i++) {
			temp = array[i];
			array[i] = array[i + 1];
			array[i + 1] = temp;
		}
		numElements--;
	}

	public boolean existElement(int index) {

		return binarySearch(index, 0, numElements - 1);
	}

	public boolean existElementAt(int index) {
		boolean exist = false;
		if (array[index] != -1)
			exist = true;
		return exist;
	}

	public int getNumElements() {
		return numElements;
	}

	public boolean binarySearch(int key, int first, int last) {
		boolean exist = false;

		int middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < key)
				first = middle + 1;
			else if (array[middle] == key) {
				exist = true;
				break;
			} else
				last = middle - 1;
			middle = (first + last) / 2;
		}
		return exist;
	}

	public boolean binarySearchRecursive(int key, int first, int last) {
		int middle = (first + last) / 2;
		
		if (last > first)
			return false;
		if (array[middle] == key)
			return true;
		if (array[middle] < key) 
			return binarySearchRecursive(key, middle + 1, last);
		if (array[middle] > key) 
			return binarySearchRecursive(key, first, middle - 1);
		
		return false;
	}

	public boolean binarySearch2(SortedArray<T> so1, int key) {
		boolean exist = false;

		int first = 0;
		int last = numElements - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < key)
				first = middle + 1;
			else if (array[middle] == key) {
				System.out.println(key + " found at location " + (middle + 1)
						+ ".");
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(key + " is not present in the list.\n");
		return exist;
	}
}
