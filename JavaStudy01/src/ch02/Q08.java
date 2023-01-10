package ch02;
import java.util.Scanner;
//연내의 경과 일 수(while문을 사용).

public class Q08 {
	//각 달의 일 수
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},		//평년
			{31,29,31,30,31,30,31,31,30,31,30,31}		//윤년
	};
	
	//서기 year년은 윤년? (y:1/n:0)
	static int isLeap(int year) {
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}
	
	//서기 y년 m월 d일 연내 경과 일수
	static int dayOfYear(int y,int m,int d) {
		while(--m!=0) {
			d += mdays[isLeap(y)][m-1];
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("연내 경과 일수를 구함");
		
		do {
			System.out.println("년 : "); int year = stdIn.nextInt();
			System.out.println("월 : "); int month = stdIn.nextInt();
			System.out.println("일 : "); int day = stdIn.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n",dayOfYear(year,month,day));
			
			System.out.println("한 번 더 할까요?(1.예/0.아니오) : ");
			retry = stdIn.nextInt();
		}while(retry==1);
		
	}

}
