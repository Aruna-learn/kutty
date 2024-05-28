package practical;

public class StringReverse {

	public static void main(String[] args) {
	String s="Dream biggerer than bigg";
	String reverse="";
	for (int i=s.length()-1;i>=0;i--) {
		
		reverse=reverse+s.charAt(i);
	}
	System.out.println("original string is: " +s);
	System.out.println("reverse string is:"+reverse);

	}

}
