package functions;

public class MostFrequent {
	public static void main(String[] args) {
        String s = "banana";

        char result = mostFrequent(s);

        System.out.println("Most frequent character: " + result);
    }

    public static char mostFrequent(String s) {
        int[] freq = new int[256]; // ASCII

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        char maxChar = '\0';
        int max = 0;

        // Find max frequency
        for (char c : s.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                maxChar = c;
            }
        }

        return maxChar;
    }
}


