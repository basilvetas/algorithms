package sortingAlgorithms;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] a = new int[]{2, 3, 5, 6, 7, 8, 1, 4, 2, 0, 7, 8, 8, 0, 3, 4};
		
		selectionSort(a);
		System.out.println( "Selection sort: \n");
		printArray(a);
	}
	
	public static void selectionSort(int[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			int jmin = i;
			
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[j] < a[jmin])
				{
					jmin = j;
				}
			}
			
			if(jmin != i)
			{ 
                //swap the elements!
                int temp = a[i];
                a[i] = a[jmin];
                a[jmin] = temp;
			}
		}
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
