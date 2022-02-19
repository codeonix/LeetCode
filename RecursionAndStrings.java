/***********************************************************************************
**************************** Recursion and String **********************************
Problem : You have given a String ,and two characters .You need to replace all the first
characters with the second characters .

Algorithm :
1.if str.length() == 0 return str.
2.Recusrsive case 

***************************************************************************************
**************************************************************************************/

import java.util.Scanner;
public class RecursionAndStrings {
 public static String replace(String str,char ch1,char ch2){
   if(str.length() == 0 )
       return str; //base case
 String  smallOutput = replace(str.substring(1),ch1,ch2);
 if(str.charAt(0) ==  ch1)
   return ch2+smallOutput;
  return str.charAt(0)+smallOutput;
}

//Driver code :
public static void main(String ssr[]){
Scanner s = new Scanner(System.in);
String str = s.next();
char ch1 = s.next().charAt(0);
char ch2 = s.next().charAt(0);
System.out.println(replace(str,ch1,ch2));
    }
}
