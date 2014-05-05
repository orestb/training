//package com.lohika.orest;

import java.util.Scanner;

public class RandomArray {
	static int [][] randomArray = new int[20][20];
	
	public static void main(String[] args) {
		int i, j;

		Scanner scan = new Scanner(System.in);
		System.out.println("Input first array's dimension, integer -");
		int N = scan.nextInt();
		System.out.println("Input second array's dimension, integer -");
		int M = scan.nextInt();
		int [][] originalArray = fillArray(N, M);
		
		System.out.println("Original array. Random integers from 0 to 100");
		for (i=0; i<N; i++) {
			for (j=0; j<M; j++) {
				System.out.print(originalArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("New array. Numbers <10 replaced on 0");
		for (i=0; i<N; i++) {
			for (j=0; j<M; j++) {
				if (originalArray[i][j]<10) {
					System.out.print(0+" ");
				}
				else {
					System.out.print(originalArray[i][j]+" ");
				}
				}
			System.out.println();
			}
			
			}
	//Method for random array initializing with integers form 0 to 100
public static int[][] fillArray(int N, int M) {
	int i, j;
	for (i=0; i<N; i++) {
		for (j=0; j<M; j++) {
			randomArray [i][j] = (int) (100*Math.random());
		}
	}
	return randomArray;
}
}
