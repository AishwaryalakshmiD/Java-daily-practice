package programs;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {

	public static void main(String[] args) {
		String arr[] = {"eat","nat","silent","ate","cars","tan","tab","scar","tea","bat","listen"};
		boolean[] visited = new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(visited[i]==false) {
				ArrayList<String> list = new ArrayList<String>();
				list.add(arr[i]);
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i].length()==arr[j].length()) {
						char[] arr1 = arr[i].toCharArray();
						char[] arr2 = arr[j].toCharArray();
						Arrays.sort(arr1);
						Arrays.sort(arr2);
						
						
						if(Arrays.equals(arr1, arr2)) {
							list.add(arr[j]);
							visited[j]=true;
							
							
						}
						
					}
					
					
				}		
				System.out.println(list);
			}
			
		}
		
		

	}
	
	
}
