package ch01;

import java.util.Scanner;

//n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.
public class Q17 {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("단수 : ");
			n = inputInt.nextInt();
		}while(n<=0);
		
		npyra(n);
		System.out.println();
		rnpyra(n);
	}
	
	static void npyra(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	
	static void rnpyra(int n) {
		for(int i=n;i>0;i--) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=i*2-1;j>0;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
