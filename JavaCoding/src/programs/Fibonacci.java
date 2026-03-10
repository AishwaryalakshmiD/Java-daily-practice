package programs;

public class Fibonacci {
	public static int fibo(int n) {
		if(n==1)
			return 0;
		else if(n==2||n==3) 
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
		
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(fibo(n));
		
	}

}
