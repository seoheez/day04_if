package day04_if;

import java.util.Scanner;

public class Ex06_while {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name = null;
		int num = 1;
		// 첫 글자가 소문자이면 0으로 초기화 하고 
		// String 처럼 첫글자가 대문자면 null로 초기화 해야 오류를 줄인다.
		if(num == 1) {
			name = "test1";
		}
		System.out.println(name);
		
		while(true) {
			System.out.print("이름 입력 : ");
			name = input.next();
			System.out.println("당신의 이름은 " +name+" 이군요");
					
			
		}
	}

}
