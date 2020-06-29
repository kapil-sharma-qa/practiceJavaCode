package mainSolutions;

import java.util.Arrays;

import actionClasses.returnArrayElementsSum;

public class ArrayElementsSum {

	public static void main(String[] args) {
		returnArrayElementsSum eleSum = new returnArrayElementsSum();
		int[] arr1= {2,4,3,4,4};
		String str= Arrays.toString(arr1);
		System.out.println("Sum of all elements in "+ str+ " is : "+ eleSum.sumElements(arr1));

	}

}
