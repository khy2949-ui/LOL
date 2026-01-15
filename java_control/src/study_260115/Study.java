package study_260115;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		
//		int num = sc.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//		
		
		
//		// 정수 하나를 입력받아 1부터 그 수까지 출력
//		
//		int sum = 0; 	// 계산 준비(초기화)
//				
//		for(int i=1; i<=num; i++) {		// 계산(반복)
//			sum = sum+i;				
//		}
//		
//		// 최종 결과는 for문 밖에서**
//		System.out.println(sum);	// 결과 출력
		
		
		// 1부터 10까지 더하면서 짝수일때만 합 출력하기		
		
//		int sum = 0;
//		
//		for(int i=1; i<=num; i++) {
//			if(i%2==1)
//				sum = sum+i;				
//		}
//		System.out.println(sum);
		
		
		// 정수 하나를 입력받아 1부터 그 수까지의 짝수의 개수 출력
//		int count = 0;
//		
//		for(int i=1; i<=num; i++) {
//			if(i%2==0)
//				count++;
//		}
//		System.out.println(count);
//		
//			
		
//		int count = 0;
//		double avg = 0;
//		int sum = 0;
//		
//		for(int i=1; i<=5; i++) {
//			int n = sc.nextInt();
//			
//			sum = sum+n;
//			count++;	
//			avg = sum/count;
//		}
//			
//		System.out.println((double)avg);
		
		int sum = 0;
		int count = 0;
		int[] i = { 40, 70, 24, 55, 39, 23};
		
		if(i.length%2==0) {
			count++;
			sum = sum+i[0];
		}
			System.out.println("개수 : " + count);
			System.out.println("합 : " + sum);
		
		
		
		
	}
	
}
