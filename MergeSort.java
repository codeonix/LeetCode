/****************************************************************************************
********************** Merge Sort Using Recursion ***************************************

Problem :

Alorithm :
1. If 0 or 1 element than it is already sorted. (base acse);
2.Recursive case :
3.call merge sort on both divided part and then do
4.small calculation .

*****************************************************************************************
****************************************************************************************/
import java.util.Scanner;
public class MergeSort{
public static void mergeSort(int[] arr){
        int start =0,end = arr.length-1;
       //sorting by dividing array int0 two parts :
          if(start >=end)
              return ;
    
          int mid = (start +end)/2;
        int arr1[] = new int[mid+1];
        for(int p=0;p<=mid;p++)
            arr1[p] = arr[p];
        int arr2[] = new int[end-mid ];
        for(int p=0;p<=(end-mid-1);p++)
            arr2[p] = arr[p+mid+1];
          mergeSort(arr1);
          mergeSort(arr2);
          
          // Now we hae Two Merged Sorted Array and We need to merge them :
         int m = arr1.length,n=arr2.length;
		
		int i=0,j=0,k=0;
		while(i<m && j<n) {
			if(arr1[i]<=arr2[j]) {
				arr[k]= arr1[i];
				i++;
				k++;
			}
			else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<m) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n) {
			arr[k]= arr2[j];
			j++;
			k++;
		}
         
	}

//Drive Code :
public static void main(String ssr[]){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int arr[] = new int[n];
 for(int i=0;i<=n-1;i++)
    arr[i] = s.nextInt();
mergeSort(arr);
for(int i=0;i<=n-1;i++)
  System.out.print(arr[i]+" ");
      }

}
