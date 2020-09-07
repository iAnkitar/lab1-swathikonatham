/* CSCI-513: Lab-1
 * Team - Swathi Reddy Konatham (Z1864290)
 *        Ankita Ratnaparkhi (Z1907718)
 * ClassName - BubbleSort
 * Description - Implementation of Bubble Sort
 * */


public class BubbleSort implements SortStrategy {
	long startTime = 0;
	long endTime   = 0;
	long totalTime = 0;
	
	@Override
	public long[] sort(long[] ar) {
		startTime = System.currentTimeMillis();
		   for (int i = (ar.length - 1); i >= 0; i--)
		   {
			  // swapped variable keeps track of the swapping
			  boolean swapped = false;
		      for (int j = 1; j <= i; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		              long temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		              swapped = true;
		         } 
		       } 
		      if (swapped == false)
		          break;
		    }
		   endTime = System.currentTimeMillis();
		   totalTime = endTime - startTime;
		   return ar;
	}
	
	@Override
	public long getSortTime() {
		return totalTime;
	}
	
	@Override
	public void resetTimer() {
		startTime = 0;
		endTime = 0;
	}
	
	@Override
	public String strategyName() {
		return "Bubble Sort";
	}

}
