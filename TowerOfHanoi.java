/*************************************************************************
 * ***********************************************************************
 **************************** Tower Of Hanoi *****************************
 *
 *Problem :Tower of Hanoi is a mathematical puzzle 
 *where we have three rods
 * and n disks. The objective of the puzzle is to move 
 * all disks from source rod to destination rod using third rod 
 * (say auxiliary). The rules are :
1) Only one disk can be moved at a time.
2) A disk can be moved only if it is on the top of a rod.
3) No disk can be placed on the top of a smaller disk.
Print the steps required to move n disks from source rod to destination 
rod.
Source Rod is named as 'a', auxiliary rod as 'b' and destination rod 
as 'c'.
 *
 *Algorithm : 
 *1. If n==1 then move disk from pole A to C.
 *2.n-1 disks from A to B with the Help of  C.
 *3. Nth Disk from A to C.
 *4.n-1 disks from  B to C with the help of A.
 *************************************************************************
 *************************************************************************/

package recursion;
import java.util.*;


public class TowerOfHanoi {
	public static void towerOfHanoi(int n,char source,char auxilary,char destination) {
		 if(n==0){
	            return;
	        }
		if(n ==1) {
			System.out.println( source + " "+ destination);
		    return;
		}
		towerOfHanoi(n-1, source, destination, auxilary);
		System.out.println(source + " "+ destination);
		towerOfHanoi(n-1, auxilary, source, destination);
	}
	
	//Driver Code 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char source = s.next().charAt(0);
		char auxilary = s.next().charAt(0);
		char helper = s.next().charAt(0);
		towerOfHanoi(n, source, auxilary, helper);
		s.close();
		
		
	}

}
