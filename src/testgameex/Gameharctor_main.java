package testgameex;

public class Gameharctor_main {
	public static void main(String[] args) {
		//����� Ȱ, ���ݷ� 100, ȭ�찹�� 100
		//Archer Ŭ����
		//new -> ����Ÿ�� ��ü�� �����ϰ� �ּҸ� �����ִ� ����
		//new Ŭ�����̸�() -> ������ -> Ŭ������ ������ ����
		Archer archer = new Archer("Ȱ",100,100);
		archer.attack();
		archer.reload(100);
		archer.evasion();
		
		
		//����� ��, ���ݷ� 100, ���г����� 100
		Warrior warrior = new Warrior("��", 100, 100);
		warrior.taunt();
		warrior.attack();
		warrior.guard();
	}
}
