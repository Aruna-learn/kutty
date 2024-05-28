package practical;

public class ListOfEvenNumbers {

	public static void main(String[] args) {
		int n=15;
		System.out.println("the even numbers are 1 to" +n+": ");
		 
		for (int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+ " ");
			}
		}
		
		

	}

}
