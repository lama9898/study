package javaStudy.day01;

import java.util.Scanner;

public class BasicIO {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("A+B="+(A+B));
		System.out.println("A-B="+(A-B));
		System.out.println("A*B="+(A*B));
		System.out.println("A/B="+(A/B));
		System.out.println("A%B="+(A%B));
	}
}
