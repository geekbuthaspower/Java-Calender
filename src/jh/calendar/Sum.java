package jh.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		// 출력 : 화면에 두 수의 합을 출력한다.
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(" ");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		System.out.println(first + second);
	}
}

// 이전에 만들어 둔 구구단 최종미션2 참고해서 만들어보니 잘 된다. 참고안하면 못 만든다.