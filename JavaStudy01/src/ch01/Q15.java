package ch01;

import java.util.Scanner;

//4가지 형태의 직각 이등변 삼각형을 출력하는 메서드를 작성하세요.
public class Q15 {
	
	//1. 왼쪽 아래가 직각인 삼각형
	static void triangleLB(int n) {
		for(int i=0;i<n;i++) {				//i행 (i = 1,2,3,~,n)
			for(int j=0;j<i+1;j++) {			//j행 i개의 *
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//2. 왼쪽 위가 직각인 삼각형
	static void triangleLU(int n) {
		for(int i=0;i<n;i++) {				//i행 (i = 0,1,2,~,n)
			for(int j=0;j<n-i;j++) {		//j행 n-i개의 *
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//3. 오른쪽 위가 직각인 삼각형
	static void triangleRU(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//4. 오른쪽 아래가 직각인 삼각형
	static void triangleRB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("삼각형의 단수 : ");
			n = inputInt.nextInt();
		}while(n<=0);
		
		System.out.println("왼쪽 아래가 직각 : ");
		triangleLB(n);
		System.out.println();
		
		System.out.println("왼쪽 위가 직각 : ");
		triangleLU(n);
		System.out.println();
		
		System.out.println("오른쪽 위가 직각 : ");
		triangleRU(n);
		System.out.println();
		
		System.out.println("오른쪽 아래가 직각 : ");
		triangleRB(n);
		System.out.println();
	}
	
}
