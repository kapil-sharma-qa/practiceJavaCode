package mainSolutions;

import java.util.Scanner;

import actionClasses.returnMultiplicationTable;

public class MultiplicationTable {

	public static void main(String[] args) {
		int count=1;
		System.out.println("Which number multiplication Table you want? ");
		Scanner scan=new Scanner(System.in);
		int number= scan.nextInt();
		returnMultiplicationTable mTable = new returnMultiplicationTable();
		while(count<=10) {
			System.out.println(mTable.multipliedNum(number)+",");
			count++;
		}

	}

}
