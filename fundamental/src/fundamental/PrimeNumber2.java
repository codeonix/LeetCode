package fundamental;
import java.util.*;
public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int div = 2 ; div<=num -1 ; div++) {
			if(num%div ==0) {
				System.out.println( num + " is  composite");
				break;
			
			}
			else {
				System.out.println(num + " is Prime");
			}

		}
	}
}


//retrun will exit from main 