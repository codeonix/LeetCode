/*****************************************************************************************
************************************  First Index   **************************************

Problem : Given an array of length N and an integer x, you need to find and return the
 first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.


Algorithm :
1.Base case would be  if ( n==0 ) return -1.
2.Recursive case would be :break problem into 1 and (n-1 )  or (n-1) and 1
               a. if(arr[0] ==x) return 0.
               b. return firstIndex(arr+1,x);

******************************************************************************************
****************************************************************************************/
import java.util.Scanner;
public class FirstIndex{
      public static int firstIndex(int arr[],int x){
        
        if(arr.length == 0) //base case
             return -1;
        if(arr[0] == x)
            return 0;
        int  newArray[] = new int[arr.length-1];
       for(int i=1;i<=arr.length-1;i++)
        newArray[i-1] = arr[i];
         int res = firstIndex(newArray,x);
         if(res == -1)
           return -1;
           return res+1;
      
          }
 //Driver Code :
public static void main(String ssr[]){
    Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int x = s.nextInt();
     int arr[] = new int[n];
    for(int i=0;i<=n-1;i++)
    arr[i] = s.nextInt();
    System.out.println(firstIndex(arr,x));
   }
}
