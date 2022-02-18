/*****************************************************************************************
------------------------------------------------------------------------------------------
********************  Square Pattern 01: *************************************************

Problem :
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444

Algorithm :
1.Number of rows =n
2.Number of columns n=4
3.will Print 4 each columns .

*****************************************************************************************
****************************************************************************************/


import java.util.Scanner;
public class Pattern1{
   public static void  pattern1(int n ){
     for(int i=1;i<=n;i++){
    for(int j =1;j<=n;j++){
     System.out.print("4" + " ");}
    System.out.println();}
 }
//Driver Code 
public static void main(String args[]){
   Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  pattern1(n);
  }
}
