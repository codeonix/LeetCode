/*************************************************************************************
********************************* Remove Consecutive *********************************
Problem : You have given a String and you need to remove consecutive characters
from that string .
Given a string S, remove consecutive duplicates from it recursively.

Algorithm :
1.Base case would be String.length()<=1 return str.
2.recursive case 


*****************************************************************************************
****************************************************************************************/

import java.util.Scanner;
public class RemoveConsecutive{
public static  String remove(String str){
  if(str.length() <= 1)
      return str;
 String smallOutput = remove(str.substring(1));
if(str.charAt(0) == str.charAt(1))
    return smallOutput;
else
   return str. charAt(0) + smallOutput;
}

//Driver  code :
public static void main(String ssr[]){
 Scanner s= new Scanner(System.in);
String str =s.next();
System.out.println(remove(str));
    }
}
