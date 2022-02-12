/*********************************************************************************
**********************************************************************************
Problem :You will have three Numbers and   you have to print average of Three Numbers .
Algorithm :
01.Take Three Numbers From User .
02.Find It's Average .
03.Store It Into a Variable.
04.Print or Use that Variable .


Time complelexity =O(1) and Space complexity = O(1)
********************************************************************************
*******************************************************************************/


import java.util.Scanner;
public class AverageOfThreeNumbers02{
     public static void main(String args[]){
            Scanner s = new Scanner(System.in);
           System.out.println("Enter Three Numbers :");
           int n1= s.nextInt();
          int n2= s.nextInt();
           int n3= s.nextInt();
          double average = (n1+n2+n3)/3.0;
        System.out.println("The average of " + n1 + " , " + n2 + " and " + n3 + " is : " + average );
    }
}
