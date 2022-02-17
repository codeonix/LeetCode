/*************************************************************************************
********************************** Last Index in Linear Search ***********************

Problem :Given an array of length N and an integer x, you need to find and return the
 last index of integer x present in the array. Return -1 if it is not present in the
 array.Last index means - if x is present multiple times in the array, return the
 index at which x comes last in the array.You should start traversing your array
 from 0, not from (N - 1).Do this recursively. Indexing in the array starts from 0.


Algorithm : 
1.Base case would be if (arr.length ==0) return -1.
2.Recursive case would be :
             a.first call recursive case
            b.Then  do small calculation.
*****************************************************************************************
*****************************************************************************************/
import java.util.Scanner;
public class LastIndex{
  public static int lastIndex(int arr[],int x){
     //base case :
    if(arr.length == 0)
          return -1;
//recursive case:
   int newArray[] = new int[arr.length-1];
  for(int i=1;i<=arr.length-1;i++)
      newArray[i-1] = arr[i];
  int ans = lastIndex(newArray,x);
   if(ans != -1)
    return ans+1;
   //small case :
  if(arr[0] == x)
    return 0;
   return -1;
     }
public static void main(String ssr[]){
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
 int x = s.nextInt();
 int arr[] = new int[n];
 for(int i =0;i<=n-1;i++)
  arr[i] = s.nextInt();
System.out.println(lastIndex(arr,x));
         }
}
