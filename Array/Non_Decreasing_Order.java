import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossible(int[] arr, int n) {
		// Write your code here.
		int count = 0;
		for(int i=1;i<n;i++)
		{
             if(arr[i]<arr[i-1])
			 {
				 count++;
			 
			 if(count>1)
			{
			return false;
			}
			  if (i - 2 < 0 || arr[i - 2] <= arr[i]) {
                    arr[i - 1] = arr[i]; 
                } else {
                    arr[i] = arr[i - 1]; 
                }

			 }
		}
		
		return true;
	}
}
