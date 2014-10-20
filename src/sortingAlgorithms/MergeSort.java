package sortingAlgorithms;


public class MergeSort {

		int comparisonCount;
		
	    public  MergeSort ()
	    {
	        comparisonCount = 0;
	    }
		
	   private boolean advanceCount (boolean b)
	   {
	       comparisonCount++;
	       return b;
	   }
		
		double [] copy (double[] a, int first, int last)
			{
		       double[] result = new double[last-first];
		       
		       for (int dest = 0; first < last; first++, dest++)
		           result[dest] = a[first];
		       
		       return result;
		   }
		
	   public double[] mergeSort (double[] d)
	   {
	       if (d.length < 2)
	           return d;
	       
	       // Create two pieces
	       
	       int start = 0, end = d.length, mid = (start+end)/2;
	       double[] left = copy(d, start, mid), right = copy(d, mid, end);
	       
	       // Sort them
	       
	       left = mergeSort(left);
	       right = mergeSort(right);
	       
	       // Merge them together
	       
	       double[] merged = new double[d.length];
	       int leftPos = 0;
	       int rightPos = 0;
	       for (int mergedPos = 0; mergedPos < d.length; mergedPos++)
	       {
	           // Determine if we copy an element from left or right
	       
	           if (rightPos ==  right.length)
	           {
	               merged[mergedPos] = left[leftPos];
	               leftPos++;
	           }
	           else if (leftPos ==  left.length)
	           {
	               merged[mergedPos] = right[rightPos];
	               rightPos++;
	           }
	           else if (advanceCount(left[leftPos] < right[rightPos]))
	           {
	               merged[mergedPos] = left[leftPos];
	               leftPos++;
	           }
	           else
	           {
	               merged[mergedPos] = right[rightPos];
	               rightPos++;
	           }
	       }
	       
	       return merged;
	   }
}
