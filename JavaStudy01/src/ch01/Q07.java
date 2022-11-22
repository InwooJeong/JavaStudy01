package ch01;
import java.util.Scanner;

//1부터 n까지 합을 구하는 프로그램을 작성하세요.
public class Q07 {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다.");
		System.out.println("n : ");
		int n = inputInt.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			if(i<n) {
				System.out.print(i + " + ");
			}else {
				System.out.println(i);
			}
			
			sum += i;
			
		}
		//for 닫음
		
		System.out.println(" = " + sum);
		
	}

}
