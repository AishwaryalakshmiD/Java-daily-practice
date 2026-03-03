package programs;

public class CheckPrime {
	
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				
				count++;
			}
		}
		System.out.println(count);
		
		return (count==2)?true:false;
		
	}

	public static void main(String[] args) {
		int num = 29;
		System.out.println(isPrime(num));


	}

}
