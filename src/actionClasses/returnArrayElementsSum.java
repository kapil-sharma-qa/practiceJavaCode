package actionClasses;

public class returnArrayElementsSum {
	int sum=0;
	
	
	public int sumElements(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}

}
