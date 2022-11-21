package ch01;
import java.util.Scanner;

//네 값의 최소값을 구하는 min4 메서드를 작성하세요.
public class Q03 {

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
		
		int min = min4(a,b,c,d);
		
		System.out.println("최소값 : " + min);
		
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		
		return min;
	}

}
