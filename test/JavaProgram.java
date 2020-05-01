package org.test;

import java.util.Scanner;

public class JavaProgram {
	public static void main(String[] args) {
		System.out.println("Count the digits");
		int n,i=0;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while (n>0) {
			n=n/10;
			i++;
		}
		System.out.println("Number of digits present in the number is :" +i);
	}
}
