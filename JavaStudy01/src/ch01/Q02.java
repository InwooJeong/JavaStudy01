package ch01;
import java.util.Scanner;

//3 값의 최소값을 구하는 min3 메서드를 작성하세요.
public class Q02 {
	
	public static void main(String[] args) {
		
		Scanner inputInt = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("정수 3개를 입력하시요.");
		
		System.out.println("첫 번째 정수 : ");
		a = inputInt.nextInt();

		System.out.println("두 번째 정수 : ");
		b = inputInt.nextInt();
		
		System.out.println("세 번째 정수 : ");
		c = inputInt.nextInt();
		
		int min = min3(a,b,c);
		
		System.out.println("최소값 : " + min);
		
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		return min;
	}

}
