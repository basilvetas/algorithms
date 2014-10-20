package sortingAlgorithms;

public class BubbleSort 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] a = new int[]{2, 3, 5, 6, 7, 8, 1, 4, 2, 0, 7, 8};
		
		bubbleSort(a);
		System.out.println( "Bubble sort: \n");
		printArray(a);
		

	}

public static void printArray(int[] input)
{
	 for (int i = 0; i < input.length; i++) 
	 {
            System.out.print(input[i] + ", ");
     }
        System.out.println("\n");
}

public static int[] bubbleSort(int[] a)
{
	 int n = a.length;

    
     for(int i=0; i < n; i++){
             for(int j=1; j < (n-i); j++){
                    
                     if(a[j-1] > a[j]){
                             //swap the elements!
                             int temp = a[j-1];
                             a[j-1] = a[j];
                             a[j] = temp;
                     }
                    
             }
     }
	return a;
	
}


}