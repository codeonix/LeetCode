/***********************************************************************************
************************** Binary Search Using Recursion ***************************
Problem : Binary Search Using Recursion 

Algorithm :
1. Base Case Would be :  if arr.length==0 return -1;
2. Recusrive case :
3.Find mid = (start+end) /2 =>
4.if x is more than mid than will be in the right part means start = mid+1
5.if c is less than mid then will be in left side means end = mid -1

****************************************************************************************
***************************************************************************************/

import java.util.Scanner;
public class BinarySortUsingRecursion{
   public static int binarySearch(int arr[],int x,int start,int end){
  if(start > end )
    return -1;
  int mid = (start+end)/2 ;
if(arr[mid] == x)
     return mid;
else if(x > arr[mid])
return binarySearch(arr,x,mid+1,end);
else
return binarySearch(arr,x,start,mid-1);
   }

//Driver Code :
public static void main(String ssr[]){
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
int x = s.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<=n-1;i++)
     arr[i] = s.nextInt();
System.out.println(binarySearch(arr,x,0,n-1));
   }
}
  

