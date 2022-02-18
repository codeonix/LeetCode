/****************************************************************************************
************************************ Multiplication Table *******************************

Problem : Write a program to print multiplication table of n.

Algorithm :
1.Take n from user.(1<=n<=99)
2.Take a loop from 1 to 10
3.print num*i.


*****************************************************************************************
-----------------------------------------------------------------------------------------
*****************************************************************************************/

import java.util.Scanner;
public class MultiplicationTable{
   public static void table(int n ){
   for(int i=1;i<=10;i++){
     int  ans = n*i;
     if(ans/10 ==0 && n/10==0 )
   System.out.print(" "+n+" * "+i+" =  "+ans);
 else if (n/10 ==0 && ans/10!=0 && i/10==0)
   System.out.print(" "+n+" * "+i+" = "+ans);
 else if(n/10 ==0 && ans/10!=0 && i/10!=0)
   System.out.print(" "+n+" *"+i+" = "+ans);
 else if(n/100 == 0 && ans/100==0 && i/10 ==0)
   System.out.print(n+" * "+i+" = "+ans);
 else if(n/100 == 0 && ans/100 !=0 && i/10==0)
 System.out.print(n+" * "+i+" ="+ans);
else
   System.out.print(n+" *"+i+" ="+ans);
    System.out.println();
   }
}
//Driver Code:
public static void main(String ssr[]){
  Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 table(n);
   }
}
