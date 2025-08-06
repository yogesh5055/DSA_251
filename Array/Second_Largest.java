import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
        int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{   int temp = max;
				max = arr[i];
				if(max!=temp)
				{
				second_max = temp;
				}
			}
			else if(arr[i]>second_max && arr[i]<max)
			{
				second_max=arr[i];
			}
		}
		if(second_max == Integer.MIN_VALUE)
		{
			return -1;
		}
		else{
            return second_max;
		}
		

	}
}
