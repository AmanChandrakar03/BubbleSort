package sorting;

import java.util.Arrays;

public class BubbleSortUsingRecursion {

	public static void main(String[] args) {
		
		int[] arr = {3,2,5,4,1};
		System.out.println("Before sorting"+Arrays.toString(arr));
		bubbleSortRecu(arr,arr.length);
		System.out.println("After sorting"+Arrays.toString(arr));

	}

	private static void bubbleSortRecu(int[] arr,int n) {
		
		//base case
		if(arr.length==1) {
			return;
		}
		int count=0;
		
		for(int i = 0;i<arr.length-1;i++) 
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				count++;
			}
		if(count==0) {
			return;
		}
		bubbleSortRecu(arr,n-1);
		
	}

}
