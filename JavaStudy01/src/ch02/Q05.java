package ch02;
//배열 b의 모든 요소를 배열 a에 역순으로 copy하는 메소드를 작성하세요.

import java.util.Scanner;

public class Q05 {
	
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length?a.length : b.length;
		for(int i=0;i<num;i++) {
			a[i] = b[b.length-i-1];
		}
	}
	
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("a 요소수 : ");
		int numa = inputInt.nextInt();
		int[] a = new int[numa];
		
		for(int i=0;i<numa;i++) {
			System.out.println("a["+i+"] : ");
			a[i] = inputInt.nextInt();
		}
		
		System.out.println("b 요소수 : ");
		int numb = inputInt.nextInt();
		int[] b = new int[numb];
		
		for(int i=0;i<numb;i++) {
			System.out.println("b["+i+"] : ");
			b[i] = inputInt.nextInt();
		}
		
		rcopy(a,b);
		
		System.out.println("배열 b 모든 요소를 배열 a에 역순으로 복사했습니다.");
		
		for(int i=0;i<numa;i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		
	}

}
