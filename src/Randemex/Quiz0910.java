package Randemex;

import java.util.Random;
import java.util.Scanner;

public class Quiz0910 {
	public static void main(String[] args) {
		// q1) 1~100������ ������ �����ִ� ���ٿ� ��ȸ10
		 Random rand = new Random();
		Scanner input = new Scanner(System.in);
		// 0~99���� ������ +1 -> 1~100
		 int num = rand.nextInt(100) + 1;

		boolean isrun = true;// �ݺ��� ���Ѻ��� -> �����߻���
		int count = 10; // ��ȸ -> ����Ƚ��
		System.out.println("UP&Down");
		while (isrun) {
			if (count > 0) { // 0����ũ�� ����
				System.out.println("���ڸ� �Է��ϼ���");
				int inputnum = Integer.parseInt(input.nextLine());
				if (num > inputnum) {
					System.out.println("UP ������ȸ:" + count);
				} else if (num < inputnum) {
					System.out.println("Down ������ȸ :" + count);
				} else {
					System.out.println("�����Դϴ�. ����:" + num + "������ȸ" + count);
					// ���� 1 ���α׷��� ����
					// isrun = false; //�������� �⺻���� ���شٿ�
					// System.out.println("���α׷�����");
					// ����2 �絵���ڵ�
					/*
					 * System.out.println("�ٽ� ����? y/n"); String input_str = input.nextLine(); if
					 * (input_str.equals("y")) {// count ->10���� ����,num ������ ���� count = 10; num =
					 * rand.nextInt(100) + 1; // ������ �ٽ��ʱ�ȭ } else if (input_str.equals("n")) { isrun
					 * = false; System.out.println("���α׷�����"); }
					 */
					//���� 2 �絵�� �Լ�
					//isrun = Check();
				}
				count--;
			} else { // count <=0 ����
				// ����1 ���α׷��� ����
				// System.out.println("������ȸ�� �����ϴ�. ���α׷�����");
				// isrun = false;
				System.out.println("���� ��ȸ�� �����ϴ�.");
				System.out.println("�ٽ� ����? y/n");
				String input_str = input.nextLine();
				if (input_str.equals("y")) {// count ->10���� ����,num ������ ����
					count = 10;
					num = rand.nextInt(100) + 1; // ������ �ٽ��ʱ�ȭ
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
					isrun = false; // �������� �⺻���� ���شٿ�
				}

			}
		}

	}
}
