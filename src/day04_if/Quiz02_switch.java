// 1번 우리집을 입력하고 자동으로 2번 회사가 입력 되지 않고 보기의 숫자를 다시 입력할 수 있도록 수정했다.
package day04_if;

import java.util.Scanner;

public class Quiz02_switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int select;
		String home = null;
		String office = null;

		while(true) {
			System.out.println();
			System.out.println("1. 우리집 등록 | 2. 회사등록 | 3. 등록보기");
			System.out.println(">");
			select = input.nextInt();

			switch(select) {   
			case 1 : System.out.println("1. 우리집 등록");
			
				System.out.println("우리집 입력 : ");
				home = input.next();
				System.out.println("우리집: " + home);break;

			
			case 2 : System.out.println("2. 회사 등록");
			
				System.out.println("회사 입력 : ");
				office = input.next();
				System.out.println("회사 : " + office);break;   
			

			case 3 : System.out.println("3. 등록 보기: ");
			System.out.println("=============");
			System.out.println("우리집: " + home);
			System.out.println("회사 : " + office);
			System.out.println("=============");
			}

		}



	}

}
