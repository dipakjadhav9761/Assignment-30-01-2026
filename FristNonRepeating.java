package functions;

public class FristNonRepeating {
	public static void main(String[] args) {
		String s="banana";
		char result = firstNonRepeating(s);

        System.out.println("firstNonRepeating: " + result);
	}

	public static char firstNonRepeating(String s) {
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (s.indexOf(c) == s.lastIndexOf(c)) {
	            return c;
	        }
	    }
	    return '\0';
	}
}



