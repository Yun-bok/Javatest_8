package Random;

import java.util.Scanner;

public class UD {
	/*
	 * Q1) 1~100������ ������ ���ߴ� Up&Down ��Ʈ Random rand = new Random(); //0~99���� ������ +1
	 * -> 1~100�����̴� int num = rand.nextInt(100)+1;
	 *  �Է¹ޱ�
	 *  �� ��ȯ���ֱ�
	 *  ��ȸ �����
	 */
	int sum;
	int num = (int)(Math.random()*99+1);
	int count;
	
	UD(int sum,int num, int count) {
		this.sum =sum;
		this.num =num;
		this.count =count;
	}	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		//Random rand = new Random();
		//System.out.println("1~100���� ���ڸ� �Է����ּ���");//���
		//�����Է�
		
	}
	
	public void roop() { //�ݺ�
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("1~100���� ���ڸ� �Է����ּ���");
			int sum = Integer.parseInt(input.nextLine());
			if(sum<num) { //�����Լ��� �Է°����� ũ��
				System.out.println(sum+"Up"+"��ȸ"+count);
						count--;
			}else if(sum>num) { //�Է°��� ���������� ũ��
				System.out.println(sum+"Down"+"��ȸ"+count);
						count--;
			}else if(count>0){
				System.out.println(gameover);
				break;

			}
		}
	}
	public void rand() { //��������?
		
	}
	
	public void Count(int count) { //��ȸ
		
		for(int i=0; i<10; i++) {
			if(i<=0)
				System.exit(count);
		}
	}
	
	
	public void gameover(int count) {
		Scanner input = new Scanner(System.in);
		int str = Integer.parseInt(input.nextLine());
		System.out.println("1.���ӳ� ���α׷� ����," + "2.�ٽõ����Ͻʴϱ�?");
		if(str==1) {
			System.out.println("���α׷�����");
		}else if(str==2) {
			System.out.println("�ٽý���"); //��ȸ10���� �ʱ�ȭ
			
		}
		
	}
}


