package StringReverse;

public class ReverseString {
	
	
	
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
	
	
	
	public static void main(String[] args) {
		System.out.println(reverseRecursively("Gagan"));
		
	}
}
