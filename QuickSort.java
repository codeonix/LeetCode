/*************************************************************************************
********************************* Quick Sort *****************************************
Algorithm :
1. If we have an array then pick an element and place it into it's right place .
2. Every grreater element will go right side of pivot  element and every smaller 
elemnt will goes left side of that element .

1. partition
2. recursion w.r.t pivot element 
****************************************************************************************
****************************************************************************************/

package recursion;
import java.util.*;
public class QuickSort {
	   public static int partition(int a[],int si,int ei){
	        int pivotElement=a[si];
	        int smallerNumCount=0;
	        for(int i=si+1;i<=ei;i++){
	            if(a[i]<pivotElement){
	                smallerNumCount++;
	            }
	        }
	        int temp=a[si+smallerNumCount];
	        a[si+smallerNumCount]=pivotElement;
	        a[si]=temp;
	        int i=si;
	        int j=ei;
	        while(i<j){
	            if(a[i]<pivotElement){
	                i++;
	            }else if(a[j]>=pivotElement){
	                j--;
	            }else{
	                 temp=a[i];
	                a[i]=a[j];
	                a[j]=temp;
	                i++;
	                j--;
	            }
	        }
	        return si+smallerNumCount;
	    }
	    public static void quickSort(int a[],int si,int ei){
	        if(si>=ei){
	            return;
	        }
	        int pivotIndex=partition(a,si,ei);
	        quickSort(a,si,pivotIndex-1);
	        quickSort(a,pivotIndex+1,ei);
	    }
		//Driver Code :
		public static void main(String ssr[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<=n-1;i++)
		  arr[i] = s.nextInt();
		quickSort(arr,0,n-1);
		for(int i=0;i<=n-1;i++)
			System.out.print(arr[i] + " ");
		

		   }
}
