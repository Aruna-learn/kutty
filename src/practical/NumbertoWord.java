package practical;

public class NumbertoWord {
	static void numberToWords(char num[]) {
		int len=num.length;
		if (len==0){
			System.out.println("empty");
			return;
		}
		if (len>5){
			System.out.println("\n not empty");
			return;
		}
	}

	public static void main(String[] args) {
numberToWords("1". toCharArray());
	}



}
