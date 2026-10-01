

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,1,8,7,6,2,4,9,5};
		
		showArray(array);
		quickSort(array);
		showArray(array);
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public static void quickSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive quickSort *
		//**********************************************
		quickSort(array,0,array.length-1);
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if(left<right) {
			int pi= partition(array, left, right);
			quickSort(array, left, pi-1);
			quickSort(array, pi+1, right);
		}
		
		
	}
	
	//Partition
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int low = left-1;
		for(int i=left; i<right; i++) {
			if(arr[i] <= pivot) {
				low++;
				int temp = arr[low];
				arr[low] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[low+1];
		arr[low+1] = arr[right];
		arr[right] = temp;
		return low+1;
		
		
	}

}
