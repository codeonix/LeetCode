/*  *********************************************************
   **********************************************************

Problem : You  have an array of N numbers and You need to find and print the largest among all the elements of that array .

Algorithm : 
01.Take N numbers From User and Store them into an Array.
02.Let currentMax = Integer.MIN_VALUE;
03.Traverse whole array and compare the max with every elements. if any element is greater than the max element then update max by that element.
04.After end of loop ,you will have maximum among them .
05.use currentMax.

Time Complexity : O(n)
Space Complexity : O(n)

*************************************************************************************
*************************************************************************************
 */



import java.util.Scanner;
public class LargestOfNNumbers{
public static void main(String args[]){
      Scanner s = new Scanner(System.in);
     System.out.println("Enter the value of n ");
     int n = s.nextInt();
     int arr[] = new int[n];
     int max = Integer.MIN_VALUE;
     
//take numbers from user 
     for(int i=0 ; i <=n-1;i++)
     arr[i] = s.nextInt();

//traverse the array :
     for(int i =0;i<=n-1;i++)
     if(max < arr[i])
      max = arr[i];

//Print the maximum value:

    System.out.println("maximum among " + n + " numbers is " + max);
    }
}
