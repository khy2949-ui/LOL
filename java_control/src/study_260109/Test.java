package study_260109;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 문제1.
		
		String name = "홍길동";
		int age = 25;
		double height = 175.5;
		String gender = "남";
		boolean student = true;
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("성별 : "+gender);
		System.out.println("학생 여부 : "+student);
		
		// 문제2.
		// a = 10, b = 20;
		
		
		
		
		
		
		// 문제3.
		int width = 8;
		int height1 = 5;
		
		System.out.println(width*height1);
		
		
		// 문제4.
		int kor = 85;
		int eng = 90;
		int mat = 78;
		int total = kor + eng + mat;
		int avg = total / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (int) avg);
		
		// 문제5.
		// 전체 초(second) = 3,726초
		
		
		
		// 문제6.
		int score = 72;
		
		if(score>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		// 문제7.
		Scanner kbd = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		
		int sc = kbd.nextInt(); 
		
		if(sc >= 90)
			System.out.println("A");
		else if(sc>=80 && sc<=89)
			System.out.println("B");
		else if(sc>=70 && sc<=79)
			System.out.println("C");
		else if(sc>=60 && sc<=69)
			System.out.println("D");
		else
			System.out.println("F");
		
		
		// 문제 8.
		int n = 10;
		int tot = 0;
	
		
		
		// 문제 9.
		int[] arr = {10, 20, 30, 40, 50};
		int num = 0;
		
		for(int i=0; i<arr.length; i++) {
			num = num+arr[i];
		}
		System.out.println("총합 : "+num);
		double average = num/ arr.length;
		System.out.println("평균값 : "+(int)average);
		
		// 문제10.
		int[] scores = {87, 65, 92, 100, 74};
		int max = scores[0];
		int min = scores[0];
		
		for(int i=0; i<scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
		}		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
		// 문제 11.
		int[] nums = {3, 8, 15, 22, 7, 10};
		
		
		
		
		
		
		
		
		
	}

}


