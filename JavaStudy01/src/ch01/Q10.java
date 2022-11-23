package ch01;

import java.util.Scanner;

//정수 a,b를 입력받아 b-a를 출력하는 프로그램을 작성하세요.
public class Q10 {
	
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("a : ");
		int a = inputInt.nextInt();
		
		int b = 0;
		while(true) {
			System.out.println("b : ");
			b = inputInt.nextInt();
			if(b>a) {
				break;
			}
			System.out.println("b는 a보다 커야합니다.");
		}
		
		System.out.println("b - a : " + (b - a));
	}
	
}
