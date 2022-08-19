package jh.calendar;

import java.util.Scanner;

public class calendar {
	public static void main(String[] args) {
		int a,b;
		
		Scanner scanner = new Scanner(System.in);
		String s1,s2;
		System.out.println(" 해당하는 년도와 월을 입력해주세요.  입력예시:2022 8");
		
		// 입력 : 키보드 입력 (해당하는 년도, 월)
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		// 출력 : 해당 월의 최대 일수 출력
		if(b == 1) {
			System.out.printf("%d년 %d월은 31일까지 있습니다.", a, b);
		}
		if(b == 2) {
			if(a%4 == 0) {
				System.out.printf("%d년 %d월은 29일까지 있습니다.", a, b);	
			} else {
				System.out.printf("%d년 %d월은 28일까지 있습니다.", a, b);
			}
		}
		if(b == 3) {
			System.out.printf("%d년 %d월은 31일까지 있습니다.", a, b);
		}
		if(b == 4) {
			System.out.printf("%d년 %d월은 30일까지 있습니다.", a, b);
		}
		if(b == 5) {
			System.out.printf("%d년 %d월은 31일까지 있습니다.", a, b);
		}
		if(b == 6) {
			System.out.printf("%d년 %d월은 30일까지 있습니다.", a, b);
		}
		if(b == 7) {
			System.out.printf("%d년 %d월은 31일까지 있습니다.", a, b);
		}
		if(b == 8) {
			System.out.printf("%d년 %d월은 31일까지 있습니다.", a, b);
		}
		if(b == 9) {
			System.out.printf("%d년 %d월은 30일까지 있습니다.", a, b);
		}
		if(b == 10) {
			System.out.printf("%d년 %d월은 31일까지 있습니다.", a, b);
		}
		if(b == 11) {
			System.out.printf("%d년 %d월은 30일까지 있습니다.", a, b);
		}
		if(b == 12) {
			System.out.printf("%d년 %d월은 31일까지 있습니다.", a, b);
		}
		scanner.close();
	}
}

//6. 배열을 활용하는 방법은 잘 모르겠다. 배열을 쓰면 간단해질 것 같다.


//5. 출력 멘트 수정. 
//이전 : System.out.println("30일까지 있습니다.");
//이후 : System.out.printf("%d년 %d월은 31일까지 있습니다.", a, b);


//4. 해당년도에 따라 2월의 출력값이 달라지도록 구현
//a가 2016, 2020, 2024 => 2024 나누기 4의 나머지가 0.


//3. 일단 입력하는 월에 따라 해당 일수 출력하는 것부터 구현.


//2. 찾아보니 2월이 29일인 경우도 있다.('윤일')  # 2016/2 2020/2 2024/2 -> 29일까지.
//입력값 형식과 출력값 형식을 바꿔봤다.
//입력 : 키보드 입력 (해당년도, 해당 월)
//출력 : 해당 월의 최대 일수 출력


//1. 주어진 과제
//변수, if, 배열
//3(엔터)
//3월은 31일까지 있습니다.





//package jh.calendar;
//
//public class calendar {
//	public static void main(String[] args) {
//		System.out.println(" 일 월  화 수  목 금  토");
//		System.out.println("--------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");		
//	}
//}