package practical;

import java.util.Scanner;

public class SmallestofThreeNumbersternarysc {

	public static void main(String[] args) {
		int a, b, c, temp, smallest;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		System.out.println("enter b number");
		b=sc.nextInt();
		System.out.println("enter c number");
		c=sc.nextInt();
		
		temp=a<b?a:b;
		smallest=c<temp?c:temp;
		System.out.println("smallest number is:" +smallest);

	}

}

//If we want to compare three numbers in a single statement, we must use the following statement.
//largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b); 