package ch02;
//1,000 이하 소수를 열거 v1

public class X09 {

	public static void main(String[] args) {
		int counter = 0; //나눗셈 횟수
		
		for(int n=2;n<=1000;n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				if(n%i==0) { //나누어 떨어지면 -> 소수가 x
					break;   //반복문 필요 x
				}
			}
			if(n==i) {		 //마지막까지 나누어떨어지지 않음
				System.out.println(n);
			}
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
		
	}

}
