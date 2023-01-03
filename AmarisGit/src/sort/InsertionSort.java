package sort;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		Random random=new Random();
		int[] numbers= {2,3,5,1,6,8,7};
		/*int[] numbers=new int [10];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=random.nextInt(100);
		}*/

		System.out.println("Before");
		printArray(numbers);
		
		insertSort(numbers);
		
		System.out.println("After");
		printArray(numbers);
	}

	private static void insertSort(int[] inputArrays) {
		for(int i=1;i<inputArrays.length;i++) {
			int currentValue=inputArrays[i];
			int j=i-1;
			while(j>=0 && inputArrays[j]>currentValue) {
				inputArrays[j+1]=inputArrays[j];
				j--;
			}
			inputArrays[j+1]=currentValue;
		}
		
	}

	private static void printArray(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
}
