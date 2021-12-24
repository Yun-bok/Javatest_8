package testgameex;

import java.util.Scanner;

public class Game_main {
	//���α׷� ���� -> ����
	//����Ŭ����(�����Լ�) - �ֻ�ܺ��� -> ���ϴ� �������������
	//�Է��� �ޱ����� ���� input
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//����ĳ����Ŭ���� �迭 ���� character_arr

		Gameharctor[] character_arr = new Gameharctor[8];
		//boolean ���� �ݺ��� ������ ���� �������� isrun ����
		boolean isrun = true;
		//while(���ǽ�) ���ǽ��� �����ϸ�(��) true -> {�����ڵ�} ����
		while (isrun) {
			//����� ���Ǹ� ���� ���
			System.out.println("1. ĳ���� ����, 2.ĳ���� ����, 3.ĳ���� ��ȸ, 4.ĳ���ͻ���, 5.����");
			//input.nextLing ->���ڿ� -> int ��ȯ
			int num = Integer.parseInt(input.nextLine());
			//���ǹ�
			//switch(����)
			//case ��:   -> ������ ���� Ÿ�� ��ġ
			//���� �� ������ ���� break;������ ������ ����
			//��̸�();  ������, �޼ҵ�(�Լ�)
			//�޼���or������(�Ű�����)
			//�Ű����� -> Ÿ�� ���� �̸�	->��� �޼���(�Ű�����Ÿ�Կ� �´°�)
			//Ÿ�� ����� ������ �����̸� �޼���{}����� �̸�
			switch (num) {
			case 1:
				Create_char(character_arr);
				break;
			case 2:
				Select_char(character_arr);
				break;
			case 3:
				Show_char(character_arr);
				break;
			case 4:
				Delete_char(character_arr);
				break;
			case 5:
				isrun = false;
				break;

			}

		}
	}
	//�Լ�-> ���� X ->(main�ȿ�)��򰡿��� ȣ���ؾ��� ����
	static void Create_char(Gameharctor[] char_arr) {
		System.out.println("1. ����  2.�ü�");
		int num = Integer.parseInt(input.nextLine());
		if (num == 1) {
		
			//ĳ���� ����(����ĳ����Ŭ���� �迭)
			//���� �迭 ũ�� 8 , i 0~7
			for (int i = 0; i < char_arr.length; i++) {
				//ĳ���� �迭 �ε����ڸ��� �������(null)���� null �����Ͱ� ������ ��µ� ���ϴϱ�
				//Archer  Warrior  null null...8��
				//			   	    2 
				if (char_arr[i] == null) {
					//num -> �����ǹ� -> 1 ����, 2�ü�
					if (num == 1) {
						System.out.println("�������");
						char_arr[i] = new Warrior("��", 100, 100);

					} else if (num == 2) {
						System.out.println("�ü�����");
						char_arr[i] = new Archer("Ȱ", 100, 100);
					}
					return; // ->void -> �ƹ����� , �Լ����� �ǹ�
					//�Լ���ȯ���� ������ ��ȯŸ���̶� ��ġ�ϴ� ���� �ڿ� ����
					//�Լ��� ������ �ڿ��ִ°��� �Լ�ȣ���� ��ġ�� �����ִ¿�Ȱ
				}
			}
			System.out.println("�ڸ��� �����ϴ�.");
		}
	}
	//ĳ���ͼ��� ���
	static void Select_char(Gameharctor[] char_arr) {
		Show_char(char_arr);
		System.out.println("ĳ���͸� �������ּ���");
		int num = Integer.parseInt(input.nextLine());
		//��ü instanceof Ŭ����Ÿ��
		//-> ��ü�� Ÿ�� ������ Ŭ����Ÿ������ ��ȯ����üũ ����-> true
		boolean result = char_arr[num-1] instanceof Archer;
		if(result) {
			Archer archer = (Archer)char_arr[num-1];
			archer.attack();
			archer.evasion();
			archer.reload(1);
			
		}
		boolean result2 = char_arr[num-1] instanceof Warrior;
		if(result2) {//warrior Ŭ������ ��ȯ�� �Ǵ���~
			Warrior warrior = (Warrior)char_arr[num-1];
			warrior.attack();
			warrior.guard();
			warrior.taunt();
		}
	}

	static void Show_char(Gameharctor[] char_arr) {
		for (int i = 0; i < char_arr.length; i++) {
			if (char_arr[i] != null) {
				if (char_arr[i] instanceof Warrior) {
					System.out.print((i + 1) + "���� ");
				} else if (char_arr[i] instanceof Archer) {
					System.out.print((i + 1) + "�ü�");
				}
			} else {
				System.out.print((i + 1) + "�������");
			}
		}
		System.out.println();
	}

	static void Delete_char(Gameharctor[] char_arr) {
		System.out.println("������ �ڸ���ȣ�� �Է����ּ���");
		int num =Integer.parseInt(input.nextLine());
		char_arr[num-1] = null; //char_arr[num-1]������ ����ĳ���Ͱ� ���־����� null�ιٲٰ� ����Ѵ�
		Show_char(char_arr);
	}
//�����Ҷ����� �����Ͱ� ���󰡴µ� �̸� �����Ϸ��� ���°� �����ͺ��̽�,�����̴�
}
