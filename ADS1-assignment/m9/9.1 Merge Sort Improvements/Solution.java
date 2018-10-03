import java.util.*;
class Merge {
	private static final int CUTOFF = 7;

	Merge() {

	}

	private static void merge(Comparable[] array, Comparable[] newarray, int low, int mid, int high) {
		assert isSorted(array, low, mid);
		assert isSorted(array, mid + 1, high);

		int i = low, j = mid + 1;
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				newarray[k] = array[j++];
			}

			else if (j > high) {
				newarray[k] = array[i++];
			}

			else if (less(array[j], array[i])) {
				newarray[k] = array[j++];
			} else {
				newarray[k] = array[i++];
			}
		}
		assert isSorted(newarray, low, high);
	}
	private static void sort(Comparable[] array, Comparable[] newarray, int low, int high) {
		if (high <= low + CUTOFF) {
			insertionSort(newarray, low, high);
			System.out.println("Insertion sort method invoked...");
			return;
		}
		int mid = low + (high - low) / 2;
		sort(newarray, array, low, mid);
		sort(newarray, array, mid + 1, high);

		if (!less(array[mid + 1], array[mid])) {
			for (int i = low; i <= high; i++) {
				newarray[i] = array[i];
			}
			System.out.println("Array is already sorted. So, skipped the call to merge...");
			return;
		}
		merge(array, newarray, low, mid, high);
	}
	public static void sort(Comparable[] a) {
		Comparable[] aux = a.clone();
		sort(aux, a, 0, a.length - 1);
		assert isSorted(a);
	}

	public static void insertionSort(Comparable[] a, int low, int high) {
		for (int i = low; i <= high; i++)
			for (int j = i; j > low && less(a[j], a[j - 1]); j--)
				exch(a, j, j - 1);
	}
	public static void exch(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
	public static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	public static boolean isSorted(Comparable[] a, int low, int high) {
		for (int i = low + 1; i <= high; i++)
			if (less(a[i], a[i - 1])) {
				return false;
			}
		return true;
	}
	public static Object show(Object[] a) {
		String s = "[";
		int i;
		for (i = 0; i < a.length - 1; i++) {
			s += a[i] + ", ";
		}
		s = s + a[a.length - 1] + "]";
		return s;
	}
}

class Solution {
	public static void main(String[] args) {
		Merge m = new Merge();
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			String tokens = s.nextLine();
			String[] lines = tokens.split(",");
			m.sort(lines);
			System.out.println(m.show(lines));
			System.out.println();

		}
	}
}