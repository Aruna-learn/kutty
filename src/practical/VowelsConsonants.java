package practical;

public class VowelsConsonants {

	public static void main(String[] args) {
		//Counter variable to store the count of vowels and consonant  
		 int vCount=0,  cCount=0;
		 
		//Declare a string    
		 String s="Aruna Reddy Poololla";
		 //Converting entire string to lower case to reduce the comparisons    
		 s=s.toLowerCase();
		 
		 for(int i=0;i<s.length();i++) {
			//Checks whether a character is a vowel   
			 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				//Increments the vowel counter    
				 vCount++;
			 }
			//Checks whether a character is a consonant    
			 else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
				//Increments the consonant counter    
				 cCount++;
			 }
		 }
		 
		 System.out.println("vovowels is" +vCount);
		 System.out.println("consonants is" +cCount);
	}

}
