package ch01;

import java.util.Scanner;

//정사각형을 출력하는 프로그램을 작성하세요.
public class Q14 {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		
		int n = 0;
		
		do {
			System.out.println("단 수 : ");
			n =  inputInt.nextInt();
		}while(n<=0);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
