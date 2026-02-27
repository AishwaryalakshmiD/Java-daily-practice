package programs;

public class FindVowels {
	public static int vowel(String s) {
		
		int count =0;
		String str = s.toLowerCase(); 
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		String str = "Interview";
		System.out.println(vowel(str));


	}

}
