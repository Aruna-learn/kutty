package practical;

public class CountStringChar {

	public static void main(String[] args) {
   String s="Poololla Family";
  int count=0;
   for( int i=0; i<s.length();i++) {
	   if(Character.isAlphabetic(s.charAt(i)))
		   count++;
	}
	System.out.println("total strings is:"+count);

}
}