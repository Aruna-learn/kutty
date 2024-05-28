package practical;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		int i=20;
		Scanner sc=new Scanner(System.in);
				System.out.println("number is:");
		i=sc.nextInt();
		if(i>0) {
			System.out.println("positive number"+i);
		}
		else if(i<0) {
			System.out.println("negative"+i);
		}
		else {
			System.out.println("number is zero"+i);
		}
	}

}
