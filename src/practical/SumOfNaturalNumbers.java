package practical;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		 int i, num, sum=0;
		//object of Scanner class  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("sum from:");
		//takes an integer as input  
		 i=sc.nextInt();
		 System.out.println("sum upto:");
		//takes an integer as input  
		 num=sc.nextInt();
		 
		 while(i<=num) {
			//adding the value of i into sum variable  
			 sum=sum+i;
			 
			//increments the value of i by 1  
		 i++;

	}
		//prints the sum  
System.out.println("sum of natural number :" +sum);
}
}
