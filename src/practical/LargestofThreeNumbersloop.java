package practical;

public class LargestofThreeNumbersloop {

	public static void main(String[] args) {
		int a=56, b=80, c=30;
		if(a>=b&&a>=c) {
			System.out.println(a+ "is largest");
		}
		else if(b>=a&&b>=c) {
			System.out.println(b+ "is largest");
		}
		else {
			System.out.println(c+ "is largest");
		}
	}

}
