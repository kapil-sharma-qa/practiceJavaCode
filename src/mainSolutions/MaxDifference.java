package mainSolutions;

import java.util.Arrays;

import actionClasses.ActionMaxDifference;

public class MaxDifference {

	public static void main(String[] args) {
		ActionMaxDifference eleSum = new ActionMaxDifference();
		int[] arr1= {1,4,8,15,17};
		String str= Arrays.toString(arr1);
		System.out.println("Max Difference of all adjacent elements in "+ str+ " is : "+ eleSum.returnMaxDifference(arr1));

	}

}
