/*****************************************************************************************
******************************************************************************************
Problem:Given an array of length N and an integer x, you need to find if x is present in
 the array or not. Return true or false.Do this recursively.


ALgorithm :
1.Take an Array from user .
2.Base case would be if n==0 return false
3.Recursive case : 
        a.Split array into to parts : firts + all remaining or
         last+all remaining or in two parts .
       b.apply recursion on both the parts.

*********************************************************************************************
********************************************************************************************/
 import java.util.Scanner;
 public class RecursiveCodeForSearchAnElementInArray{
        public static boolean search(int arr[],int x){
                    int n = arr.length;
              //base case :
              if(n==0)
                    return false;
              if(arr[0] ==x)
                    return true;
              int newArray[] = new int[n-1];
              for(int i=1;i<=n-1;i++)
                 newArray[i-1] = arr[i];
             return search(newArray,x);
         }
    //Driver Code :
public static void main(String args[]){
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int x = s.nextInt();
        int arr[] =  new int[n];
       for(int i=0;i<=n-1;i++)
          arr[i] = s.nextInt();
      System.out.println(search(arr,x));
      }
}
              
