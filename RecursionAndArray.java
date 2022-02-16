/***********************************************************************************
************************************************************************************
Recursion and Array : 
Problem : We need to check wheather array is sorted(Strictly Increasing ) or not.

Algorithm : 
1.Base case would be just first two element is sorted or not .if  arr.length ==1 then 
return true. 
2.recursive case : 
        a.if(arr[0]>arr[1]: return false
        b. now apply recursion on n-1 length from 1st index.
              i. Create a new array n-1 length.
              ii. copy all the elemnts from 1  into smallArray.
*****************************************************************************************
****************************************************************************************/
import java .util.Scanner;
public class RecursionAndArray{
        public static boolean isArraySorted(int arr[]){
           int n = arr.length;
           if(n == 1)
           return true;   //base case
              //recursive case 
           if(arr[0] > arr[1])
               return false;
              int smallArray[] = new int[n-1];
              for(int i=1;i<=n-1;i++)
              smallArray[i-1] = arr[i];
              return isArraySorted(smallArray);
            
        }
   //Driver code:
   public static void main(String ssr[]){
         Scanner s = new Scanner(System.in);
         int n =s.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<=n-1;i++)
          arr[i] = s.nextInt();
         System.out.println(isArraySorted(arr));
        }
}
