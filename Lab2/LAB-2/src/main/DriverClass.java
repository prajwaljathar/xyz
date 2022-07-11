package main;

import java.util.Scanner;
import mergesort.MergeSort;
import service.NotesCount;

public class DriverClass {
	public static void main(String[] args) {
		MergeSort msi = new MergeSort();
		NotesCount notescount = new NotesCount();
		System.out.println("Enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denomination value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		msi.sort(notes, 0, notes.length - 1);
		notescount.notesCountImplementation(notes, amount);
	}
}
