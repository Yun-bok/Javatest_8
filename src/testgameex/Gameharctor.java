package testgameex;
//Game Character Ŭ����
//�ʵ� : weapon ����, damage ���ݷ�
//������ : �����Ӱ�
//�޼��� -> attack����() - ��� : ĳ���Ͱ� �����մϴ�.
public class Gameharctor {
	//�ʵ�
	String weapon; //���� ���õ� ����-> String Ŭ����Ÿ�� -> ���ڿ��� ������ �� �ִ� ����
	int damage; //���ݷ� ���õ� ���� -> int Ŭ����Ÿ�� -> ������ ������ �� �ִ� ����
	
	//������ - Ŭ�����̸��̶� ����
	Gameharctor() { //�⺻������ -> �ٸ������ڰ� ������ �ڵ����� x
		
	}
	//�Ű����� -> (Ÿ�� ����,Ÿ�� ����) -> �ܺο��� �ʿ��� �����͸� ������
	Gameharctor(String weapon, int damage) {
		this.weapon = weapon;
		this.damage = damage; //�������ټ��ִ»����� ���� 
	}
	
	//�޼��� - Ŭ������ ����,����
	public void attack() {
		System.out.println("ĳ���Ͱ� �����մϴ�.");
	}
}
