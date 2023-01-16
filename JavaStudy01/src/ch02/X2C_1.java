package ch02;

public class X2C_1 {

	public static void main(String[] args) {
		double[] a = {1.0,2.0,3.0,4.0,5.0};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		
		double sum = 0;	//합계
		
		for(double i:a) {
			sum += i;
		}
		
		System.out.println("모든 요소 합은 " + sum);

	}

}
