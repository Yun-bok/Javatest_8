package testgameex;

public class Archer extends Gameharctor{
	//�ʵ�
	public int arrow_count; //ȭ�찹���� �����ϴ� ����
	
	//������
	public Archer(String weapon,int damage, int arrow_count) {// ��ӹ޾ұ� ������ �����ִ�
//		this.weapon =weapon;
//		this.damage =damage;
//		this.arrow_count = arrow_count;
		
		super(weapon,damage);//super�� �Ἥ �θ��� �����ڸ� �ҷ���
		this.arrow_count =arrow_count; //��ó�� ���� �ַο� ī��Ʈ�� �ʱ�ȭ
	}
	
	//�޼��� -ȸ��() - ��� ĳ���Ͱ� ȸ���մϴ�.
	public void evasion() {
		System.out.println("ĳ���Ͱ� ȸ���մϴ�.");
	}
	//����() - ��� : Ȱ�� ���ϴ�. -> arrow_count --  -> arrow_count ���
	@Override //�߿�
	public void attack() { //�θ𰡸��� �Լ��� �ڽ��� �� �����Ѵ� ������ ��ӹ޾Ƶ�
		System.out.println("Ȱ�����ϴ�.");
		arrow_count --;
		System.out.println(arrow_count);
	}
	//reload����(int cnt) - cnt��ŭ arrow_count ����
	public void reload(int cnt) {
		System.out.println("������");
		System.out.println(arrow_count);
	//	arrow_count += cnt //���� ���� �������� ���� �� ������ ����
		arrow_count = arrow_count + cnt;
		System.out.println(arrow_count);
	}

}
