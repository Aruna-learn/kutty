package practical;

public class Palindrome {

	public static void main(String[] args) {
//		int n=324;
// int r,sum=0, temp;
// 
// temp=n;
// while (n>0) {
//	 r=n%10; //getting remainder
//	 sum=(sum*10)+r;
//	 n=n/10;
// }
//
//if(temp==sum) {
//	System.out.println("palindrome" );
//}
//else {
//	System.out.println("not palindrome");
//}
//
//	}
	
	
	
	String str="Radar", reverses=" ";
	int strLength= str.length();
	for (int i=(strLength-1); i>=0;--i) {
		reverses=reverses+str.charAt(i);
		
	}
	if (str.toLowerCase().equals(reverses.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	
}
}


/*
 * 1. for loop to reverse the string
 * 
 * The loop runs from the end to the beginning of the string. The charAt()
 * method accesses each character of the string. Each character of the string is
 * accessed in reverse order and stored in reverseStr. 2. if statement to
 * compare str and reverseStr
 * 
 * The toLowerCase() method converts both str and reverseStr to lowercase. This
 * is because Java is case sensitive and 'r' and 'R' are two different values.
 * The equals() method checks if two strings are equal.
 */
