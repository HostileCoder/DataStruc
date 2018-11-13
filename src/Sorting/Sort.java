package Sorting;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 51,95,66,72,42,38,39,41,15};
		Quick(a, 0, a.length-1);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

	/***********************
	 * Selection
	 * Go through the array one element at time.
	 * For each iteration swap element in current position 
	 * with the index that hold smallest value
	 **********************/
	public static void Select(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minPos = minPos(a, i);
			swap(a, minPos, i);
		}
	}

	private static int minPos(int[] a, int from) {
		int minPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i] < a[minPos]) {
				minPos = i;
			}
		}
		return minPos;
	}

	private static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	/*****************************
	 * insertion
	 * Compare current index with index+1
	 * if a[index]>a[index+1]
	 * keep moving element at index+1 toward left until at right position 
	 ********************/
	public static void Insert(int[] a) 
										
	{
		for (int i = 1; i < a.length; i++) {
			int next = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > next) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = next;
		}
	}

	/***********************
	 * Bubble
	 * after the first inner loop is complete, the largest number will
	 * be on the right position
	 **********************/
	public static void Bubble(int[] a) {
		int n = a.length;
		int temp = 0;
		for (int i = 0; i < n; i++) 								
		{
			//"to be sorted" list is shrinking from the right for each iteration.
			for (int j = 1; j < (n - i); j++) {  
				if (a[j - 1] > a[j]) {
					// swap the elements!
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}

			}
		}
	}

	/**********************
	 * Quick
	 * Dividing part is hard
	 * no work on merge
	 * no need for new array

	 **********************/
	public static void Quick(int[] a, int from, int to) {
		
		//pick pivot
		int pivot = a[from + (to - from) / 2];
		int i = from;
		int j = to;
		
		
		
		while (i <= j) {
			//keep increment i until a[i]=>pivot
			while (a[i] < pivot) {
				i++;
			}
			//keep increment j until a[j]=>pivot
			while (a[j] > pivot) {
				j--;
			}
			//swap elements i and j which are not in order with the pivot
			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}
		//Sort each half
		if (from < j)
			Quick(a, from, j);
		if (i < to)
			Quick(a, i, to);
	}


	/**********************
	 * Merge
	 * Divide into two portion
	 * Sort each portion 
	 * Merge (merge part is harder)
	 **********************/
	public static void sort(int[] a) {
		if (a.length <= 1) {
			return;
		}
		int[] first = new int[a.length / 2];
		int[] second = new int[a.length - first.length];
		// Copy the first half of a into first, the second half into second
		for (int i = 0; i < first.length; i++) {
			first[i] = a[i];
		}
		for (int i = 0; i < second.length; i++) {
			second[i] = a[first.length + i];
		}
		sort(first);
		sort(second);
		merge(first, second, a);
	}

	private static void merge(int[] first, int[] second, int[] a) {
		int iFirst = 0; // Next element to consider in the first array
		int iSecond = 0; // Next element to consider in the second array
		int j = 0; // Next open position in a

		// As long as neither iFirst nor iSecond is past the end, move
		// the smaller element into a
		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst] < second[iSecond]) {
				a[j] = first[iFirst];
				iFirst++;
			} else {
				a[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}

		// Note that only one of the two loops below copies entries
		// Copy any remaining entries of the first array
		while (iFirst < first.length) {
			a[j] = first[iFirst];
			iFirst++;
			j++;
		}
		// Copy any remaining entries of the second half
		while (iSecond < second.length) {
			a[j] = second[iSecond];
			iSecond++;
			j++;
		}
	}

	/**********************
	 * Bucket
	 **********************/

	public static void Bucket(int[] a, int maxVal) {
		int[] bucket = new int[maxVal + 1];
		// fill with zero
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}
		// take a[i] to a[i]th element in bucket array
		for (int i = 0; i < a.length; i++) {
			bucket[a[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				a[outPos++] = i;
			}
		}
	}

	/**********************
	 * binary
	 **********************/

	public boolean binarySearch(int key, int[] data) {
		int low = 0;
		int high = data.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (data[middle] == key) {
				return true;
			}
			if (data[middle] < key) {
				low = middle + 1;
			}
			if (data[middle] > key) {
				high = middle - 1;
			}
		}
		return false;
	}

}
