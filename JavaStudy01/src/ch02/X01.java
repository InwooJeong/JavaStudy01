package ch02;
//구성 요소 자료형이 int형인 배열(구성 요소수는 5 : new에 의해 본체를 생성)

public class X01 {

	public static void main(String[] args) {
		int[] a = new int[5]; //배열 선언
		
		a[1] = 37; //a[1]에 37 대입
		a[2] = 51; //a[2]에 51 대입
		a[4] = a[1] * 2; //a[4]에 a[1]*2, 74 대입
		
		for(int i = 0;i < a.length; i++) { //각 요소 값을 출력
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}