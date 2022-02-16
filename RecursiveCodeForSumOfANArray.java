/***********************************************************************************
************************************************************************************
_____________________________________________________________________________________
@author surajrajput
  Problem :  Given an array of length N, you need to find and return the sum of all
   elements of the array.
   Do this recursively.
   
   Algorithm :
   1. Take an Array From user.
   2.Base case would be n==0 then return 0.
   3.recursive case would be break the array into smaller case .
   4.From end we can split array easily .
 **************************************************************************************
 **************************************************************************************/
package string;
import java.util.*;
public class RecursiveCodeForSumOfAnArray  {
	
	public static int recursiveCodeForSumOfAnArray(int arr[],int n) {
		
		//base case :
		 if(n==0)
			 return 0;
		 return arr[n-1]+recursiveCodeForSumOfAnArray(arr, n-1);
	}
	//Driver code :
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<=n-1;i++)
			arr[i] = s.nextInt();
		System.out.println(recursiveCodeForSumOfAnArray(arr, n));
	}
	

}




