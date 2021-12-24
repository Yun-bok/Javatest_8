package ������0910ex;

import java.util.Random;
import java.util.Scanner;
public class ������0910 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		UpAndDown();
	}
	
	static void UpAndDown(){
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		
		System.out.println("1 ~ 100 ���� �� (999 -> ���� | 0 -> �ٽ� ����)");
		for(int i = 1; i <= 10; i++) {
			System.out.print("���� �Է� : ");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input == 999) {
				System.out.println("����");
				return;
			}else if(input == 0) {
				System.out.println("�����");
				UpAndDown();
				return;
			}
			
			if(input < num) {
				System.out.println("Up");
			}else if(input > num) {
				System.out.println("Down");
			}else {
				System.out.println(" ���� ");
				System.out.println("���� : " + num);
				End();
				return;
			}
			
			System.out.println("== ���� ��ȸ : " + (10 - i) + " ==");
		}
		
		End();
	}
	
	static void End() {
		System.out.println("���� ��");
		System.out.print("�ٽ� �����Ͻðڽ��ϱ�? -------> 1.�ٽ� ���� or ����");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if(num2 == 1) {
			System.out.println("�ٽ� ����");
			UpAndDown();
		}else {
			System.out.println("����");
			return;
		}
	}
}
