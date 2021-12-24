package sec04;

public class SupersonicAirplane extends Airplane{
	//static ��ü ���� X -> Ŭ�����̸����� �����Ҽ��ִ�. -> ��簴ü ��������
	//final -> �ϳҤ� ���� ����Ǹ� ���� �Ұ�
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	
	@Override  		// -> ���� �����ϰ� �ǵ��� �ڵ�
	public void fly() {
		if(flymode==SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		}else {
			//Airplane ��ü�� fly() �޼��� ȣ��
			super.fly();
		}
	}

}
