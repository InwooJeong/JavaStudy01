package ch01;

import java.util.Scanner;

//정수 a,b를 포함, 그 사이 모든 정수 합을 구하여 반환하는 static int sumof(int a, intb b)를 작성하세요.
public class Q09 {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("a와 b를 포함한 그 사이 모든 정수의 합을 구한다.");
		
		System.out.println("a : ");
		int a = inputInt.nextInt();
		
		System.out.println("b : ");
		int b = inputInt.nextInt();
		
		System.out.println("합은 : " + sumof(a,b));
	}
	
	static int sumof(int a, int b) {
		int min = 0;
		int max = 0;
		int n = 0;
		
		if(a < b) {
			min = a;
			max = b;
		}else {
			max = a;
			min = b;
		}
		
		for(int i=min;i<max+1;i++) {
			n += i;
		}
		
		return n;
	}

}
