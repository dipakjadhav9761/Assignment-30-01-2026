package functions;

public class DuplicateCharacter {
	   public static void main(String[] args) {
	        String str = "banana";

	        char[] chars = str.toCharArray();

	        System.out.print("Duplicate characters: ");

	        for (int i = 0; i < chars.length; i++) {
	            for (int j = i + 1; j < chars.length; j++) {
	                if (chars[i] == chars[j]) {
	                    System.out.print(chars[i] + " ");
	                    break; // avoiding the same multiple value
	                }
	            }
	        }
	    }
	}


