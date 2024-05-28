package practical;

import java.util.Scanner;

public class LargestofThreeNumbersternarysc {

	public static void main(String[] args) {
		int a,b, c, temp, largest;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		System.out.println("enter b number");
		b=sc.nextInt();
		System.out.println("enter c number");
		c=sc.nextInt();
		//comparing a and b and storing the largest number in a temp variable  
		temp=a>b?a:b;
		
		//comparing the temp variable with c and storing the result in the variable  

		largest=c>temp?c:temp;
		
		System.out.println("largest number is:"+largest);

	}

}


//If we want to compare three numbers in a single statement, we must use the following statement.
//largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b); 