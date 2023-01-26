package ch03;
//선형 검색(for)

import java.util.Scanner;

public class Ex02 {
	
	static int seqSearch(int[] a,int n, int key) {
		for(int i=0;i<n;i++) {
			if(a[i]==key) {
				return i;			//검색 성공(인덱스 반환)
			}
		}
		
		return -1;					//검색 실패(-1 반환)
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];							//요솟수가 num인 배열
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+ i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");					//키 값을 입력
		int ky = stdIn.nextInt();
		int idx = seqSearch(x, num, ky);				//배열 x에서 키 값이 ky인 요소 검색
		
		if(idx==-1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(ky+"은(는) x["+ idx + "]에 있습니다.");
		}
		
	}

}
