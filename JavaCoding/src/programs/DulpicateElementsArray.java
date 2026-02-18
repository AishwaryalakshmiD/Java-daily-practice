package programs;

public class DulpicateElementsArray {
	

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 4, 1,4};
	boolean[] visited = new boolean[arr.length];
			
			for(int i=0;i<arr.length;i++) {
				int count = 1;
				
				for(int j=i+1;j<arr.length;j++) {
					if(visited[j]==false) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
					}
					}
					
				}
				if(count>1) {
					System.out.println(arr[i]);
				}
				
			}
		
		

	}

}
