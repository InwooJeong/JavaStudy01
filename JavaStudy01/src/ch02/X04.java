package ch02;
//배열 요소 최대값을 나타냅니다.(값을 입력 받음)

import java.util.Scanner;

public class X04 {
	
	//배열 a의 최대값을 구하여 반환
	static int maxOf(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("키 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = inputInt.nextInt();	//배열 요소수를 입력 받음
		
		int[] height = new int[num];	//요소수가 num인 배열을 생성
		
		for(int i=0;i<num;i++) {
			System.out.println("height["+i+"] : ");
			height[i] = inputInt.nextInt();
		}
		
		System.out.println("최대값은 " + maxOf(height)+ "입니다.");
		
	}

}
