package practical;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		int n1=0, n2=1,n3,i, count=10;
		//System.out.println(n1+ " "+ n2);//we are printing n1 and n2
		
		for(i=2; i<count;i++) { // starts with 2 beause and 0and 1 already printed
			
			n3=n1+n2;//add and store the values in n3
			System.out.println(" " +n3);
			n1=n2;
			n2=n3;
			
		}
		
		

	}

}
