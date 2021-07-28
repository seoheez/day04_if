package day04_if;

import java.util.Scanner;

public class Quiz001 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int kor;
		System.out.println("국어점수 입력: ");
		kor = input.nextInt();
		
		if(kor > 90) {
			System.out.println("당신의 국어점수는"+ kor + "이며, A학점입니다.");
		}else if(kor > 80) {
			System.out.println("당신의 국어점수는"+ kor + "이며, B학점입니다.");
		}else if(kor > 70) {
			System.out.println("당신의 국어점수는"+ kor + "이며, C학점입니다.");
		}else { 
			System.out.println("당신의 국어점수는"+ kor + "이며, D학점입니다.");
			System.out.println("공부하세요...");
		}
	}

}
