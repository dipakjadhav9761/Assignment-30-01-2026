package functions;

public class CountDigit {
	public static void main(String[] args) {
		System.out.println(countDigits("gy5ug5yu8g8yu"));
	}	

	private static int countDigits(String str) {
		int digitCount = 0;
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				digitCount++;
			
			}
		}
		return digitCount;
	}
}
	

	

		
	