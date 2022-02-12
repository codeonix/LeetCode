/*********************************************************************************************************
**********************************************************************************************************
**********************************************************************************************************

Problem : You have given a number n and you have to print all the integers from 1 to n.

Algorithm : 
01.Take a number from user.
02. Take a loop from 1 to n.
03.print i.

Time complexity : O(n)
Space Complexity : O(1)

*********************************************************************************************************
********************************************************************************************************/


import java.util.Scanner;
public class PrintUptoN{
       public static void main(String args[]){
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     for(int i=1;i<=n;i++)
     System.out.print(i+ " ");
    System.out.println();
    }
}
