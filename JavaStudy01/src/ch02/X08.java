package ch02;

import java.util.Scanner;
//입력 받은 10진수를 2진수 ~ 32진수로 기수 변환하여 나타냄

public class X08 {
	
	static int cardConvR(int x, int r, char[] d) {
		//정수 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자리수를 반환
		int digits = 0;	//변환 후 자리수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r;
		}while(x != 0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;								 //변환하는 정수
		int cd;								 //기수
		int dno;							 //변환 후 자리수
		int retry;							 //다시 한 번?
		char[] cno = new char[32];			 //변환 후 각 자리 숫자를 넣어두는 문자 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			}while(no<0);
			
			do {
				System.out.println("어떤 진수로 변환할까요? (2~36) : ");
				cd = stdIn.nextInt();
			}while(cd<2||cd>36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.println(cd + "진수로는 ");
			for(int i=dno-1;i>=0;i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("한 번 더 할까요? (1.Yes/0.No) : ");
			retry=stdIn.nextInt();
		}while(retry==1);
	}

}
