//처음에만 1,2,3 중에 입력하고 입력 후엔 자동으로 2번을 적을 수 있게된다.
//그래서 정보가 하나만 입력 되고 하나씩만 보이게 만들었다. 
//어떻게 추가로 정보를 계속 입력해서 보여질 수 있는지 내일 수업을 듣고 수정해야겠다. 
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