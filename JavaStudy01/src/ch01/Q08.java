package ch01;
import java.util.Scanner;

//가우스 공식을 이용한 합을 구하는 프로그램을 작성하세요.
public class Q08 {
	
	public static void main(String[] args) {
		
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다.");
		System.out.print("n : ");
		int n = inputInt.nextInt();
		
		int sum = (n+1)*(n/2)+(n%2==1?(n+1)/2:0);
		
		System.out.println("1부터 " + n + "까지 합은 " + sum);
		
	}

}
