package ������0910;

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
				System.out.println("���ڸ� �Է��ϼ���");
				int inputnum = Integer.parseInt(input.nextLine());
				if (num > inputnum) {
					System.out.println("UP ������ȸ:" + count);
				} else if (num < inputnum) {
					System.out.println("Down ������ȸ :" + count);
				} else {
					System.out.println("�����Դϴ�. ����:" + num + "������ȸ" + count);
				}
			
				count--;
			} else { 
				System.out.println("���� ��ȸ�� �����ϴ�.");
				System.out.println("�ٽ� ����? y/n");
				String input_str = input.nextLine();
				if (input_str.equals("y")) {
					count = 10;
					num = rand.nextInt(100) + 1; 
				} else if (input_str.equals("n")) {
					isrun = false;
					System.out.println("���α׷�����");

				}
				System.out.println("UP&Down");
				System.out.println("���ڸ� �Է��ϼ���");
				int inputnum = Integer.parseInt(input.nextLine());
				if (num > inputnum) {
					System.out.println("UP");
				} else if (num < inputnum) {
					System.out.println("Down");
				} else {
					System.out.println("�����Դϴ�. ����:" + num);
					isrun = false; 
				}

			}
		}

	}
}

