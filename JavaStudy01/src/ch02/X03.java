package ch02;
//배열을 복제

public class X03 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();	//b는 a의 복제를 참조
		
		b[3] = 0;				//한 요소에만 0을 대입  -- 본체 그 자체가 아닌 복제
		
		System.out.print("a =");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+ a[i]);
		}
		
		System.out.print("\nb =");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+ b[i]);
		}
		
		//배열 변수 b는 a가 참조하는 배열 본체의 복제를 참조
	}

}
