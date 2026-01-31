package functions;

public class CountUppercaseLowercase {
	public static void main(String[] args) {
		String input="Apartment";
		CountUppercaseLowerCase(input);
		
		
	}
	public static void CountUppercaseLowerCase(String str) {
		int Upper=0;
		int Lower=0;
		for(char c: str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				Upper++;
			
			}
			else 
				if (Character.isLowerCase(c)) {
				Lower++;
				
		}
		
	}
		System.out.println("UpperCase letters:"+Upper);
		System.out.println("LowerCase letters:"+Lower);
	}
}


