package ch01;
import java.util.Scanner;

//4 값의 최대값을 구하는 max4 메서드를 작성하세요.
public class Q01 {

	public static void main(String[] args) {
		
		Scanner inputInt = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("정수 4개를 입력하시요.");
		
		System.out.println("첫 번째 정수 : ");
		a = inputInt.nextInt();

		System.out.println("두 번째 정수 : ");
		b = inputInt.nextInt();
		
		System.out.println("세 번째 정수 : ");
		c = inputInt.nextInt();
		
		System.out.println("네 번째 정수 : ");
		d = inputInt.nextInt();
		
		int max = max4(a,b,c,d);
		
		System.out.println("최대값 : " + max);
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		
		return max;
	}

}
