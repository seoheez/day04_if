package day04_if;

import java.util.Scanner;

public class Quiz002 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("나이 입력: ");
		age = input.nextInt();
		
		if(age < 8) {
			System.out.println(age + "세는 학교를 다니지 않습니다.");
		}else if(age >= 8 && age <= 19) {
			System.out.println(age + "세는 학교를 다닙니다.");
		}
		else {
			System.out.println(age + "세는 대학(원)생 입니다.");
		}		
		
	}

}
