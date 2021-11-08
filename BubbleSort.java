import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {
		
		for (int i = 0; i < array.length- 1; i++)
			for (int j = 0; j < array.length - i - 1; j++)
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	public static void main(String args[]) {

		int[] input = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 };


		BubbleSort.bubbleSort(input);

		System.out.println("Sorted Array in Ascending Order:");
		System.out.println(Arrays.toString(input));
	}
}


