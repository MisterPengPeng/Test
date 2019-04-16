package grokkingAlgorithms;

public class SelectionSort {
	public static void main(String[] args) {
		int[] data = {5, 3, 6, 2, 10};
		int[] sort = selectionSort(data);
		for (int i : sort) {
			System.out.print(i + " ");
		}
	}
	
	public static int findSmallest(int[] data) {
		int smallest = data[0];
		int smallestIndex = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] < smallest) {
				smallest = data[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	
	public static int[] selectionSort(int[] data) {
		int[] result = new int[data.length];
		for (int i = 0; i < result.length; i++) {
			int smallestIndex = findSmallest(data);
			result[i] = data[smallestIndex];
			data[smallestIndex] = Integer.MAX_VALUE;
		}
		return result;
	}
}
