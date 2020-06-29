package mainSolutions;

import java.util.ArrayList;

public class UniqueNumbers {

	public static void main(String[] args) {
		
		int[] arr= {4,5,5,5,4,6,6,9,4};
		ArrayList<Integer> alist= new ArrayList<Integer>();
		int n=0;
		for(int i=0;i<arr.length;i++) {
			int k=1;
			if(!alist.contains(arr[i])) {
				alist.add(arr[i]);
				
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						k=k+1;
					}
				}
				System.out.println("Occurence of "+alist.get(n++)+" is "+k+" times");
			}
		}
		System.out.println("Array After removing duplicate "+alist);
		Object[] arr1=alist.toArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
