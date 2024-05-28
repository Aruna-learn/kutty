package practical;

public class smallestofthreenumbersloop {

	public static void main(String[] args) {
		int a=12, b=34, c=90;
		
		if(a<=b&&a<=c) {
			System.out.println(a+ "smallest number");
		}
		else if (b<=c&&b<=a) {
			System.out.println(b+"smallest number");
		}
		else {
			System.out.println(c+"smallest number");
		}
	}

}
