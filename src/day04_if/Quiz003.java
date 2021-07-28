package day04_if;

import java.util.Scanner;

public class Quiz003 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력: ");
		
		int num1, num2;
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + "이(가) 더 큰 수 입니다." );			
		}
		else {
			System.out.println(num2 + "이(가) 더 큰 수 입니다." );			
		}
	
	}

}
