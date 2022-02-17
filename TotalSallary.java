/****************************************************************************************
*********************************  Total Salary *****************************************

Problem : Write a program to calculate the total salary of a person. The user has to
 enter the basic salary (an integer) and the grade (an uppercase character),
 and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so

Algorithm :
1.Take Basic Salary and Grade From User 
2.Calculate Totalsalary with the help of above formula.
3.Math.round(double  value of totalSalary ).
*****************************************************************************************
****************************************************************************************/
import java.util.Scanner;
public class TotalSallary{
 public static void  totalSalary(int basic,char  grade){
   int allow = 0;
   if(grade == 'A')
     allow = 1700;
  else if (grade == 'B')
     allow = 1500;
  else
    allow = 1300;
    double totalSalary = basic +0.2*basic + 0.5 *basic +allow -0.11*basic;
   System.out.println(Math.round(totalSalary));
  }
//Driver Code :
 public static void main(String ssr[]){
   Scanner s= new Scanner(System.in);
   int basic = s.nextInt();
  char grade = s.next().charAt(0);
  totalSalary(basic,grade);
   }
} 
