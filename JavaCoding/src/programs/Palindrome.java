package programs;

public class Palindrome {
	
	public static boolean isPalindrome(int a) {
		int temp = a;
		int rev=0;
		while(a>0) {
			int rem = a%10;
			rev = rev*10+rem;
			a=a/10;
			
		}
		
		return temp==rev;
		
	}

	public static void main(String[] args) {
		
		int input = 121;
		
		if(isPalindrome(input))
		{
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not a palindrome");
		}
		
		
	}

}
