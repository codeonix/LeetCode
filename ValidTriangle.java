/*******************************************************************************************************************
********************************************************************************************************************

Problem : You have given three sides of an triagle and you have to find that wheather this traingle is valid or not .


Algorithm : 
01.Take three sides from user .
02.Check validity of triangle means sum of two sides should be greater than the third one .
03.If it is correct that than p-rint it is valid other wise not.

Time Complexity : O(1)
Space Complexity : O(1)

*********************************************************************************************************************
********************************************************************************************************************/

import java.util.Scanner;
public class ValidTriangle{
     public static void main(String args[]){
    Scanner s = new Scanner(System.in);
   int  side1 = s.nextInt();
   int side2 = s.nextInt();
  int side3 = s.nextInt();
 //check for validity : 
   if( side1+side2 > side3  && side2 + side3 > side1 && side1 + side3 > side2)
      System.out.println("Triangle is Valid ");
   else
     System.out.println("Triangle is Not Valid ");
    }
}


