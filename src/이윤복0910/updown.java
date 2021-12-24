package 이윤복0910;

import java.util.Random;
import java.util.Scanner;

public class updown {
	public static void main(String[] args) {
		
		 Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		 int num = rand.nextInt(100) + 1;

		boolean isrun = true;
		int count = 10; 
		System.out.println("UP&Down");
		while (isrun) {
			if (count > 0) { 
				System.out.println("숫자를 입력하세요");
				int inputnum = Integer.parseInt(input.nextLine());
				if (num > inputnum) {
					System.out.println("UP 남은기회:" + count);
				} else if (num < inputnum) {
					System.out.println("Down 남은기회 :" + count);
				} else {
					System.out.println("정답입니다. 랜덤:" + num + "남은기회" + count);
				}
			
				count--;
			} else { 
				System.out.println("남은 기회가 없습니다.");
				System.out.println("다시 도전? y/n");
				String input_str = input.nextLine();
				if (input_str.equals("y")) {
					count = 10;
					num = rand.nextInt(100) + 1; 
				} else if (input_str.equals("n")) {
					isrun = false;
					System.out.println("프로그램종료");

				}
				System.out.println("UP&Down");
				System.out.println("숫자를 입력하세요");
				int inputnum = Integer.parseInt(input.nextLine());
				if (num > inputnum) {
					System.out.println("UP");
				} else if (num < inputnum) {
					System.out.println("Down");
				} else {
					System.out.println("정답입니다. 랜덤:" + num);
					isrun = false; 
				}

			}
		}

	}
}

