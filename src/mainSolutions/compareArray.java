package mainSolutions;

import java.util.ArrayList;

public class compareArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,8};
		int b[]= {1,4,3,8};
		ArrayList<Integer> arr= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				arr.add(a[i]);
			}
		}
		System.out.println("New Array "+ arr);
	}

}
