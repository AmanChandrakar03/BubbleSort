package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		//execute n-1 passes
		for(int i = 0;i<arr.length-1;i++) {
			boolean swapFlag = false;
			for(int j=0;j<arr.length-1-i;j++) {
				//compare consecutive elements
				//if left element is greater than right element, then swap
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapFlag = true;
				}
			}
			if(swapFlag==false) {
				break;
			}
			System.out.println(Arrays.toString(arr));
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {3,2,5,4,1};
		System.out.println("Before sorting"+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After sorting"+Arrays.toString(arr));
	

	}

}
