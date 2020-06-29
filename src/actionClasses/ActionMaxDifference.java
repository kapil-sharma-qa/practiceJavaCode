package actionClasses;

public class ActionMaxDifference {
	int diff=0,maxDiff=0;
	
	public int returnMaxDifference(int[] arr) {
		maxDiff=arr[0];
		for(int i=1;i<arr.length;i++) {
			diff=arr[i]-arr[i-1];
			if(Math.abs(diff)>maxDiff) {
				maxDiff=Math.abs(diff);
			}
		}
		return maxDiff;
		
	}
}
