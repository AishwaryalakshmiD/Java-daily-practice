package programs;

public class ReverseString {
	
	public static String reverseStr(String s) {
		String rev ="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		String str = "java";
		System.out.println(reverseStr(str));
		
	}

}
