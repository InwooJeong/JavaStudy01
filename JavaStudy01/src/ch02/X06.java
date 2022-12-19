package ch02;

import java.util.Scanner;

//배열 요소에 값을 읽어 들여 역순 정렬 합니다.

public class X06 {
	
	//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1]; a[idx1] = a[idx2]; a[idx2]=t;
	}
	
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			swap(a, i, a.length - i -1);
		}
	}
	
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = inputInt.nextInt(); //요소수
		
		int[] x = new int[num]; //요소수가 num인 배열//
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = inputInt.nextInt();
		}
		
		reverse(x); //배열 a 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"] = " + x[i]);
		}
		
	}

}
