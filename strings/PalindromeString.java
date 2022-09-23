package strings;

public class PalindromeString {

	public static void main(String[] args) {
		 String str= "madam";//239
	        String reversestr="";//980
	        for(int i=str.length()-1;i>=0;i--) {
	            reversestr=reversestr+str.charAt(i);
	        }if(str.equalsIgnoreCase(reversestr)) {
	            System.out.println("its the palindrome string");
	        }else {
	            System.out.println("its not palinrome string");
	        }

	}

	}
