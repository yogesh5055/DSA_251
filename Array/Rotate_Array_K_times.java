import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        for(int i=0;i<k;i++)
        {
            rotate(arr);
        }
        return arr;
        
    }
    static void rotate(ArrayList<Integer> arr)
    {   if(arr.size()==0) return;
        int f = arr.get(0);
        for(int i=0;i<arr.size()-1;i++)
        {
             arr.set(i,arr.get(i+1));

        }
        arr.set(arr.size()-1,f);
        
    }
}
