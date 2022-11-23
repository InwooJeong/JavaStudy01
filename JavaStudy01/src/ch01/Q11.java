package ch01;

import java.util.Scanner;

//양의 정수 자릿수를 구하세요.
public class Q11 {
	
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		int n = 0;
		
		do {
			System.out.println("정수를 입력하시요.");
			n = inputInt.nextInt();
		}while(n <= 0);
		
		int n2 = 0;
		
		while(n > 0) {
			n /= 10;
			n2++;
		}
		
		System.out.println(n2 + " 자리");
		
	}

}
