package main;

import java.util.Scanner;

import services.PayMoneyService;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] transactionArr = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < transactionArr.length; i++) {
			System.out.println("Enter the value of number " + (i + 1) + " transaction");
			transactionArr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int target = sc.nextInt();
		for (int i = 0; i < target; i++) {
			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			PayMoneyService serve = new PayMoneyService();
			serve.inspect(transactionArr, targetValue);
			System.out.println();
		}
	}

}
