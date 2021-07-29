
package day04_if;

import java.util.Scanner;

public class Quiz01_switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int day;
		while(true) {
			System.out.println("날짜를 입력하세요: ");
			System.out.println(">");
			day = input.nextInt();

			switch(day % 7)  {
			case 1 : System.out.println(day + " 월");break;
			case 2 : System.out.println(day + " 화");break;
			case 3 : System.out.println(day + " 수");break;
			case 4 : System.out.println(day + " 목");break;
			case 5 : System.out.println(day + " 금");break;
			case 6 : System.out.println(day + " 토");break;
			case 0 : System.out.println(day + " 일");break;
			
			
			
			}
			

		}

	}

}
