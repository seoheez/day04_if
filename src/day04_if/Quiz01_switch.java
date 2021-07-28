//반복적으로 월~일까지 어떻게 만들어야 하는지 잘 모르겠다. 수업내용 참고 후 수정하기
package day04_if;

import java.util.Scanner;

public class Quiz01_switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int day;
		System.out.println("날짜를 입력하세요: ");
		System.out.println(">");
		day = input.nextInt();
		
		switch(day) {
		case 1 : System.out.println("월");break;
		case 2 : System.out.println("화");break;
		case 3 : System.out.println("수");break;
		case 4 : System.out.println("목");break;
		case 5 : System.out.println("금");break;
		case 6 : System.out.println("토");break;
		case 7 : System.out.println("일");break;
		case 8 : System.out.println("월");break;
		
		}
		input.close();
		
	}

}
