package day04_if;

import java.util.Scanner;

public class Ex04_switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("수 입력: ");
		select = input.nextInt();
		switch(select) {
		case 1:System.out.println("1. 입력값 : " + select);break; 
		case 2:System.out.println("2. 입력값 : " + select);break;
		case 3:System.out.println("3. 입력값 : " + select);break;
		default:System.out.println("1,2,3을 제외한 다른 값 입력"); //else역할이라 생략가능
		}
		// switch문을 빠져나오기 위해 break를 건다.
		// switch문은 일반적으로 숫자를 많이 쓴다.
		/*if(select == 1) {
			
		}*/
	}

}
