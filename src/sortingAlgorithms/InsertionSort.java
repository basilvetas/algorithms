package sortingAlgorithms;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] a = new int[]{2, 3, 5, 6, 7, 8, 1, 4, 2, 0, 7, 8, 1, 5};
		
		insertionSort(a);
		System.out.println( "Insertion sort: \n");
		printArray(a);

	}
	
	public static int[] insertionSort(int[] a)
	{
		for(int i=1; i < a.length; i++)
		{
			int temp = a[i];
			int j = i - 1;
			
			while((j >= 0) && (a[j] > temp))
			{
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
		
		return a;
		
	}
	
	public static void printArray(int[] input)
	{
		 for (int i = 0; i < input.length; i++) 
		 {
	            System.out.print(input[i] + ", ");
	     }
	        System.out.println("\n");
	}

}
