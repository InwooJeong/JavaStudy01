package ch01;
import java.util.Scanner;

//실습 1-4의 while문이 종료될 때 변수 i 값이 n++ 이 됨을 확인하세요.
public class Q06 {
	public static void main(String[] args) {
		
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = inputInt.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i : " + i);
		
	}

}
