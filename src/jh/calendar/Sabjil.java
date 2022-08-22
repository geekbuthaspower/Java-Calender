package jh.calendar;

import java.util.Scanner;

public class Sabjil {

	public final int[] MaxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MaxDays[month - 1];
	}

	public static void main(String[] args) {

		System.out.println("해당하는 년도와 월을 입력하세요.  예시: 2022 8");

		Scanner scanner = new Scanner(System.in);

		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();

		int year, month;

		year = Integer.parseInt(s1);
		month = Integer.parseInt(s2);

		Sabjil cal = new Sabjil();

		if (year % 4 == 0 && month == 2) {
			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n", year, month, 29);
		} else {
			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n", year, month, cal.getMaxDaysOfMonth(month));
		}

		scanner.close();

	}
}

// #3# 우여곡절 끝에 class method 나누기 성공
// else 쓰자...

// #2# 시도하다가 운좋게 더 짧게 하는 방법 적용 완료.
//
//		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		if (year%4 == 0) {
//			maxDays[1] = 29;
//		}

// #1# 4년단위로 2월은 윤달(윤일)이어서 29일까지 있다. -> maxDays2를 만들어봤다.
//
//		int[] maxDays2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 4년단위로 2월은 29일까지 있다.(윤달->윤일)
//
//		if (year%4 == 0) {
//			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n", year, month, maxDays2[month - 1]);
//		} else {
//			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n", year, month, maxDays[month - 1]);
//		}}
