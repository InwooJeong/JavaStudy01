package ch02;
//배열 요소 최대값을 출력(요소와 값을 난수로 생성)

import java.util.Random;

public class Q01 {

	static int maxOf(int[] a) {
		//배열 a의 최대값을 구하여 반환
		int max = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최대값을 구합니다.");
		
		int num = 1 + rand.nextInt(20); //사람 수를 1~20의 난수로 생성
		int[] height = new int[num]; // 요소수 num인 배열 생성;
		
		System.out.println("사람수는 " + num + "명");
		System.out.println("키는 : ");
		for(int i = 0;i < num; i++) {
			height[i] = 100 + rand.nextInt(90); //요소값을 난수로 생성
			System.out.println("height [" + i + "] : " + height[i]);
		}
		
		System.out.println("최대 값은 : " + maxOf(height));
	}

}
