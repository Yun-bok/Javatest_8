package testgameex;

public class Warrior extends Gameharctor{
//�ʵ�
	public int Shield; //���г����� ������ ����
	//������
	Warrior() {// �⺻������
	}
	
	Warrior(String weapon, int damage, int shield){
		super(weapon,damage);
		this.Shield = shield;
	}
	
	//�޼���
	public void taunt() {
		System.out.println("���� �����մϴ�.");
	}
	
	public void guard() {
		System.out.println("������ �����ϴ�.");
		Shield -= 10;
		//Shield = Shield - 10;
		System.out.println("���� ������ :" + Shield);
	}
	
	@Override
	public void attack() {
		System.out.println("������ �����մϴ�.");
	}
}
