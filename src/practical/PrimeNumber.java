package practical;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=10;int i;
		boolean prime=true;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("not prime number");
				prime=true;
				break;
			}
		}
		
		if(prime==false) {
		System.out.println("prime");
		
	}

}
}
