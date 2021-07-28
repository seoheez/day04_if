package day04_if;

import java.util.Scanner;

public class Quiz004 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("정수 2개 입력: ");

		int num1, num2;
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " > " + num2);
		}else if(num1 < num2) {
			System.out.println(num1 + " < " + num2);
		}
		else {
			System.out.println(num1 + " = " + num2);
		}


	}

}
