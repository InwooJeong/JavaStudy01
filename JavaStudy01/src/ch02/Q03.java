package ch02;

import java.util.Scanner;

//배열 a의 모든 요소 합계를 구하여 반환

public class Q03 {

	static int sumOf(int[] a) {
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("요소수는 : ");
		int num = inputInt.nextInt();
		
		int[] a = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("a["+i+"] : ");
			a[i] = inputInt.nextInt();
		}
		
		System.out.println("전 요소 합은 : " + sumOf(a));
		
	}

}
